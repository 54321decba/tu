import com.alibaba.fastjson.JSON;

public class main {

	public static void main(String[] args) {
		//Encode
		Group group = new Group();
		group.setId(0L);
		group.setName("admin");

		User guestUser = new User();
		guestUser.setId(2L);
		guestUser.setName("guest");

		User rootUser = new User();
		rootUser.setId(3L);
		rootUser.setName("root");

		group.getUsers().add(guestUser);
		group.getUsers().add(rootUser);

		String jsonString = JSON.toJSONString(group);

		System.out.println(jsonString);
		//Decode 
		Group group2 = JSON.parseObject(jsonString, Group.class);
		System.out.println(group2);

	}

}
