package day17;

import java.util.Map;

public class Util {
	ClientRepository repository = ClientRepository.getInstence();
	
	public boolean overrapId(String id) {
		Map<String, ClientDTO> cMap = repository.findAll();
		for(String key : cMap.keySet()) {
			if(id.equals(cMap.get(key).getId())) {
				return true;
			}
		}
		return false;
	}
}
