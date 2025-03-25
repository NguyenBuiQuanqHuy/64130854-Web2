package huy.ntu.edu.TongHopGK.model;

public class SinhVien {
	private int id;
    private String name;
    private float diem;
	public SinhVien(int id, String name, float diem) {
		super();
		this.id = id;
		this.name = name;
		this.diem = diem;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getDiem() {
		return diem;
	}
	public void setDiem(float diem) {
		this.diem = diem;
	}
	
    
    
}
