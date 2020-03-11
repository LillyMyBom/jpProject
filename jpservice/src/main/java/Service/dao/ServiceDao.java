package Service.dao;

import java.util.List;

import Service.domain.ServiceVO;

public interface ServiceDao {
		
	public abstract List<ServiceVO> list(); //목록
	
	public abstract int delete(int SCNUM); // ?��?��
	
	public abstract int update(ServiceVO serviceVO); // ?��?��
	
	public abstract void insert(ServiceVO serviceVO); //�??���?
	
	public abstract ServiceVO select(int SCNUM); // �??��?��

}
