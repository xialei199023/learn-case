/*
 * 个人主页：http://hinylover.space
 *
 * Creation Date: 2016年4月7日 下午2:29:42
 */
/*
 * 个人主页：http://hinylover.space
 *
 * Creation Date: 2016年4月7日 下午2:29:42
 */
package demo.learn.json.jackson;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

/**
 * @author xialei
 * @version 1.0 2016年4月18日下午10:48:49
 */
public class MyJsonObject {

	private String name;
	
	//@DateTimeFormat(pattern="yyyy-MM-dd") // 使用springmvc时有效
	@JsonFormat(shape = Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone = "GMT+8")
	private Date birthday;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "MyJsonObject [name=" + name + ", birthday=" + birthday + "]";
	}
}
