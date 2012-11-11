package i377.team6.yl1;

import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class IncidentSimulatorServiceImpl implements IncidentService {
	
	ArrayList<String> descriptionList = new ArrayList<String>(Arrays.asList("Joodik kukkus seletama", "Sissetung", "Vargus ei toonud edu", "Vehiti relvaga", "Kood ei kompilleerunud"));
	ArrayList<String> locationList = new ArrayList<String>(Arrays.asList("Kohvik", "Piiripunkt", "Tolli hoone", "Parkla", "Ladu", "Puhkeruum"));
	
	@Override
	public List<Incident> getUnresolvedIncidents() {
		List<Incident> unresolvedIncidents = new ArrayList<Incident>();
		
		Random random = new Random(); // 1 - 10 unresolved incidents 
		int randomCount = random.nextInt(10);
		
		for (int i = 0; i < randomCount; i++) {
			
			Incident newIncident = new Incident();
			
			Calendar startCalendar = Calendar.getInstance();
			startCalendar.add(Calendar.DAY_OF_MONTH, (random.nextInt(20)*-1));

			newIncident.setDescription(descriptionList.get(random.nextInt(descriptionList.size() - 1)));
			newIncident.setInvolvedGuardCount(random.nextInt(6)); // 1 - 6 guards
			newIncident.setLocation(locationList.get(random.nextInt(locationList.size() - 1)));
			newIncident.setEndDate(startCalendar.getTime());
			newIncident.setStartDate(startCalendar.getTime());
			newIncident.setStatus("Unresolved");
			
			unresolvedIncidents.add(newIncident);
		}
		
		return unresolvedIncidents;
	}
}
