package com.rang.pojo.entity;

import java.time.LocalDate;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

/**
 * @ClassName Test
 * @Description TODO
 * @Author rdl
 * @Date 2020/7/7 16:45
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "test_user")
public class User {

	@Id
	@KeySql(useGeneratedKeys = true)
	private Long id;
	private String name;
	private Integer state;
	private Integer age;
	private LocalDate time;
}
