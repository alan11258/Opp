package tw.alan.myproject.opp;

class SecuritySystem{
	private String systemUser = "Sen", systemPwd = "54321";
	
	public boolean verifId1(String userName, String userPwd){
		
		if(systemUser.equals(userName) && systemPwd.equals(userPwd)){
			return true;
		}
		return false;
	}
	
	public boolean verifId2(String userName, String userPwd){
		if(systemUser.equalsIgnoreCase(userName.trim()) && systemPwd.equalsIgnoreCase(userPwd.trim())){
		return true;   //.trim去除空格
		}
		return false;
	}
}
public class CallTestEqualsEx3 {

	public static void main(String[] args) {
		SecuritySystem verify = new SecuritySystem();
		
		if(args.length >= 2){            //用陣列,輸入字串不夠不動作提示你
			boolean status = verify.verifId1(args[0], args[1]);
			System.out.println("status:" + status);
				
				if(status){
					System.out.println("Success.");
				}else{
					System.out.println("Fail");
			}
			
		}
//要進入class右鍵Properties >>> Run/Debug Setting,選calss按edits,在Arguments輸入字串,以空格分隔
	}
// .indexof不區分大小寫
}
