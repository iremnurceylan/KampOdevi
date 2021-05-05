package Entity;


import Abstract.Entity;

public class Gamer implements Entity{
		private int gamerId;
		private String firstName;
		private String lastName;
		private long nationalId;
		private int dateOfBirth;
		private String eMail;
		

		public Gamer() {}
		
		public Gamer(int gamerId, String firstName, String lastName, long nationalId, int dateOfBirth, String eMail) {
			this.gamerId = gamerId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.nationalId = nationalId;
			this.dateOfBirth = dateOfBirth;
			this.eMail = eMail;
		}

		public int getGamerId() {
			return gamerId;
		}

		public void setGamerId(int gamerId) {
			this.gamerId = gamerId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public long getNationalId() {
			return nationalId;
		}

		public void setNationalId(long nationalId) {
			this.nationalId = nationalId;
		}

		public int getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(int dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		public String geteMail() {
			return eMail;
		}

		public void seteMail(String eMail) {
			this.eMail = eMail;
		}

		


}
