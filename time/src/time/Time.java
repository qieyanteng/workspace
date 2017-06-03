package time;

public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public String toString() {
		if (hour < 10 && minute < 10 && second < 10) {
			return "0" + hour + ":" + "0" + minute + ":" + "0" + second;
		} else if (hour < 10 && minute < 10 && second >= 10) {
			return "0" + hour + ":" + "0" + minute + ":" + second;
		} else if (hour < 10 && minute >= 10 && second >= 10) {
			return "0" + hour + ":" + minute + ":" + second;
		} else if (hour < 10 && minute >= 10 && second < 10) {
			return "0" + hour + ":" + minute + ":" + "0" + second;
		} else if (hour >= 10 && minute < 10 && second < 10) {
			return hour + ":" + "0" + minute + ":" + "0" + second;
		} else if (hour >= 10 && minute < 10 && second >= 10) {
			return hour + ":" + "0" + minute + ":" + second;
		} else if (hour >= 10 && minute >= 10 && second >= 10) {
			return hour + ":" + minute + ":" + second;
		} else if (hour >= 10 && minute >= 10 && second < 10) {
			return hour + ":" + minute + ":" + "0" + second;
		} else {
			return hour + ":" + minute + ":" + second;
		}
	}
	
	public Time nextSecond() {

		if ((second + 1) == 60 && (minute + 1) == 60 && (hour + 1) == 24) {
			hour = 0;
			minute = 0;
			second = 0;
		} else if ((second + 1) == 60 && (minute + 1) == 60) {
			hour = hour + 1;
			minute = 0;
			second = 0;
		} else if ((second + 1) == 60 ){
			minute = minute + 1;
			second = 0;
		}else {
			second = second + 1;
		}
		return new Time(hour, minute, second);
	}

	public Time previousSecond() {
		if(second == 0 && minute == 0 && hour == 0) {
			hour = 23;
			second = 59;
			minute = 59;
		}else if(second == 0 && minute == 0) {
			minute = 59;
			second = 59;
			hour =hour - 1;
		}else if(second == 0) {
			minute = minute - 1;
			second = 59;
		}else {
			second = second - 1;
		}
		return new Time(hour, minute, second);
	}
}
