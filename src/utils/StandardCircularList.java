package utils;
import java.util.AbstractList;
import java.util.List;
import java.util.ArrayList;
public class StandardCircularList<T> extends AbstractList
{
	private List<T> _list = null;
	private List<T> _dummy = null;
	private int _indexA = 0;
	private int _indexB = 0;
	public StandardCircularList(List<T> list) {
		_list = list;
		_dummy =  new ArrayList<T>();
		//_dummy.addAll(list);
	}
	public void diffrence(int diff){
		
		if( diff > size()) {
			diff = diff - size();
		}
		_indexB = (diff)%size();
		_dummy.addAll(_list);
		System.out.println("top:"+((types.Team)_dummy.get(0)).getName());
	}
	public T nextA(){
		if(_indexA == size()) {
			_indexA = 0;
		}
		return nextT(_indexA);
		
	}
	public T nextB(){
		if(_indexB == size()) {
			_indexB = 0;
		}
			
		
		T returnValue = nextT(_indexB); 
		_indexB= _indexB%((size()-1)/2);
		return returnValue;
	}
	private T nextT(int index){
		if(_dummy.size() > index){
			
			return _dummy.remove(index);
		} else if(_dummy.size() > 0){
			return _dummy.remove(0);
		}
		return null;
	}
	public boolean canIterate(){
		return _dummy.size() > 0;
	}
	@Override
	public int size()
	{
		// TODO: Implement this method
		return _list.size();
	}

	@Override
	public Object get(int p1)
	{
		// TODO: Implement this method
		return _list.get(p1);
	}


	

}
