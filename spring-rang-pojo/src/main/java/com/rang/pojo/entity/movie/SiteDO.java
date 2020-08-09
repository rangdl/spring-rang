package com.rang.pojo.entity.movie;

import java.time.LocalDate;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

/**
 * @ClassName Site
 * @Description TODO
 * @Author rdl
 * @Date 2020/8/9 13:04
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "website")
public class SiteDO {

	/**
	 * id
	 */
	@Id
	@KeySql(useGeneratedKeys = true)
	private Integer id;
	private Integer mId;
	private Integer state;
	private String name;
	private String lineName;
	private String url;
	private LocalDate createdTime;
	private LocalDate modifiedTime;
}
