package semiProject.uploadProduct;

import java.sql.Timestamp;

public class UploadProductBean {
	//力前
	private int product_number; //力前锅龋
	private String category_code; // 墨抛绊府 内靛
	private String product_name; // 力前 捞抚
	private int product_price; // 力前 啊拜
	private int product_stock; // 力前 犁绊
	private String product_desc; // 力前 汲疙
	private Timestamp product_date; // 力前 殿废老
	private int product_hits; // 力前 炼雀荐
	private int product_ordered_count; //力前 林巩荐
	
	//捞固瘤
	private  int file_number;
	private String orgin_file_name;
 	private String stored_file_name;
 	private String stored_thumbnail;
 	private String delegate_thumbnail;
 	private int file_size;
 	private Timestamp create_date;
 	private String delete_check;

 	
 	private  String String_file_size;
 	
 	public String getOrgin_file_name() {
		return orgin_file_name;
	}
	public void setOrgin_file_name(String orgin_file_name) {
		this.orgin_file_name = orgin_file_name;
	}
	public String getStored_file_name() {
		return stored_file_name;
	}
	public void setStored_file_name(String stored_file_name) {
		this.stored_file_name = stored_file_name;
	}
	public String getStored_thumbnail() {
		return stored_thumbnail;
	}
	public void setStored_thumbnail(String stored_thumbnail) {
		this.stored_thumbnail = stored_thumbnail;
	}
	public String getDelegate_thumbnail() {
		return delegate_thumbnail;
	}
	public void setDelegate_thumbnail(String delegate_thumbnail) {
		this.delegate_thumbnail = delegate_thumbnail;
	}
	public int getFile_size() {
		return file_size;
	}
	public void setFile_size(int file_size) {
		this.file_size = file_size;
	}
	public Timestamp getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Timestamp create_date) {
		this.create_date = create_date;
	}
	public String getDelete_check() {
		return delete_check;
	}
	public void setDelete_check(String delete_check) {
		this.delete_check = delete_check;
	}
	
	public int getProduct_number() {
		return product_number;
	}
	public void setProduct_number(int product_number) {
		this.product_number = product_number;
	}
	public String getCategory_code() {
		return category_code;
	}
	public void setCategory_code(String category_code) {
		this.category_code = category_code;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	public int getProduct_stock() {
		return product_stock;
	}
	public void setProduct_stock(int product_stock) {
		this.product_stock = product_stock;
	}
	public String getProduct_desc() {
		return product_desc;
	}
	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}
	public Timestamp getProduct_date() {
		return product_date;
	}
	public void setProduct_date(Timestamp product_date) {
		this.product_date = product_date;
	}
	public int getProduct_hits() {
		return product_hits;
	}
	public void setProduct_hits(int product_hits) {
		this.product_hits = product_hits;
	}
	public int getFile_number() {
		return file_number;
	}
	public void setFile_number(int file_number) {
		this.file_number = file_number;
	}
	public int getProduct_ordered_count() {
		return product_ordered_count;
	}
	public void setProduct_ordered_count(int product_ordered_count) {
		this.product_ordered_count = product_ordered_count;
	}
	public String getString_file_size() {
		return String_file_size;
	}
	public void setString_file_size(String string_file_size) {
		String_file_size = string_file_size;
	}
	
}
