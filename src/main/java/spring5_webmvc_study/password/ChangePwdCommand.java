package spring5_webmvc_study.password;

public class ChangePwdCommand {
		private String currentPassword;
		private String newPassword;

		public String getCurrentPassword() {
			return currentPassword;
		}
		public void setCurrentPassword(String currentPassword) {
			this.currentPassword = currentPassword;
		}
		public String getNewPassword() {
			return newPassword;
		}
		public void setNewPassword(String newPassword) {
			this.newPassword = newPassword;
		}
		@Override
		public String toString() {
			return String.format("ChangePwdCommand [currentPassword=%s, newPassword=%s]", currentPassword, newPassword);
		}
		
		

}
