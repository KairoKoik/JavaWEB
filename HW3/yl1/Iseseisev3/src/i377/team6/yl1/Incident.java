package i377.team6.yl1;

import java.util.Date;

public class Incident {
	private Date start;
	private Date end;
	
	private String location;
	private String description;
	private String status;
	
	private int involvedGuardCount;
	
	public void setStartDate(Date start) {
		this.start = start;
	}
	
	public Date getStartDate () {
		return this.start;
	}
	
	public void setEndDate(Date end) {
		this.end = end;
	}
	
	public Date getEndDate () {
		return this.end;
	}
	
	public void setLocation (String location) {
		this.location = location;
	}
	
	public String getLocation () {
		return this.location;
	}
	
	public void setDescription (String description) {
		this.description = description;
	}
	
	public String getDescription () {
		return this.description;
	}
	
	public void setStatus (String status) {
		this.status = status;
	}
	
	public String getStatus () {
		return this.status;
	}
	
	public void setInvolvedGuardCount (int involvedGuardCount) {
		this.involvedGuardCount = involvedGuardCount;
	}
	
	public int getInvolvedGuardCount () {
		return this.involvedGuardCount;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Description ");
		builder.append(this.description);
		builder.append("\n");
		
		builder.append("Location ");
		builder.append(this.location);
		builder.append("\n");
		
		builder.append("Status ");
		builder.append(this.status);
		builder.append("\n");
		
		builder.append("InvovledGuardsCount ");
		builder.append(this.involvedGuardCount);
		builder.append("\n");
		
		builder.append("Start ");
		builder.append(this.start);
		builder.append("\n");
		
		builder.append("End ");
		builder.append(this.end);
		builder.append("\n");
		
		return builder.toString();
	}
}
