/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: MybatisInsertColumnModel
 * Author:   jayden
 * Date:     2020/7/9 6:34 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package sen.jayden;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author jayden
 * @create 2020/7/9
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MybatisInsertColumnModel extends A{
    private String column;
    private String column_value;

    public String toString() {
        return "{ \"column\":\"" + column + "\",\"column_value\":\"" + column_value + "\"}";
    }
}