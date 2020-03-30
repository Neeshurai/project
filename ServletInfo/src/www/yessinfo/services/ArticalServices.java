package www.yessinfo.services;

import java.util.ArrayList;
import java.util.List;

import www.yessinfo.model.Artical;

public class ArticalServices {

	
		List<Artical> list;
		public ArticalServices() {
			// TODO Auto-generated constructor stub
			list=new ArrayList<Artical>();
		}
	public int add(Artical s)
	{
		list.add(s);
		return 0;
	}
	public List<Artical> list()
	{
		return list;
	}
}
