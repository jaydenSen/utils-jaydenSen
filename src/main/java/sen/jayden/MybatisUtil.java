/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: MybatisUtil
 * Author:   jayden
 * Date:     2020/7/9 6:29 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package sen.jayden;

import java.lang.reflect.Field;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author jayden
 * @create 2020/7/9
 * @since 1.0.0
 */
public class MybatisUtil {

    /**
     * 获取对象内所有public属性名
     *
     * @param o
     * @return
     */
    public static MybatisInsertColumnModel getInsertFiledName(Object o) {
        Field[] fields = o.getClass().getFields();
        StringBuilder column = new StringBuilder();
        StringBuilder column_value = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            String filed_name = fields[i].getName();
            column.append(filed_name);
            column_value.append("#{item." + filed_name + "}");
            if (i < fields.length - 1) {
                column.append(",");
                column_value.append(",");
            }
        }
        return new MybatisInsertColumnModel(column.toString(), column_value.toString());
    }

    public static void main(String[] args) {
        System.out.println(getInsertFiledName(new MybatisInsertColumnModel()).toString());
    }

}