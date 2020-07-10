/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: DeepCopy
 * Author:   jayden
 * Date:     2020/7/10 10:00 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package sen.jayden;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author jayden
 * @create 2020/7/10
 * @since 1.0.0
 */
public class DeepCopy {
    /**
     * 对一个对象进行深拷贝,其实也不算拷贝,应该算序列化,好处可以无视继承以及对象内引用
     *
     * @param obj
     * @param <T>
     * @return
     * @throws Exception
     */
    public static <T extends Object> T clone(T obj) throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bout);
        oos.writeObject(obj);
        ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bin);
        return (T) ois.readObject();
    }
}