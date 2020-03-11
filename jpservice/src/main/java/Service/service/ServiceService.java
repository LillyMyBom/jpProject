package Service.service;

import java.util.List;

import Service.domain.ServiceVO;

public interface ServiceService {
    
    public abstract List<ServiceVO> list(); //목록
	
	public abstract int delete(int SCNUM); // ?��?��
	
	public abstract int edit(ServiceVO serviceVO); // ?��?��
	
	public abstract void write(ServiceVO serviceVO); //�??���?
	
	public abstract ServiceVO read(int SCNUM); //�??��?��

}
