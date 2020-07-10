/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: LinearRegression
 * Author:   jayden
 * Date:     2020/7/10 10:08 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package sen.jayden;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.math3.stat.regression.SimpleRegression;

/**
 * 计算一元线性回归,一般用于一致性分析
 * 〈〉
 *
 * @author jayden
 * @create 2020/7/10
 * @since 1.0.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LinearRegression {
    private SimpleRegression simpleRegression = new SimpleRegression(true);
    private double[][] data;
    private double slope;
    private double intercept;
    private double xMax;
    private double yMax;
    private double y;
    private double RSquare;

    public LinearRegression(double[][] data) {
        this.data = data;
        simpleRegression.addData(this.data);
        slope = roundedUtil(simpleRegression.getSlope());
        intercept = roundedUtil(simpleRegression.getIntercept());
        RSquare = roundedUtil(simpleRegression.getRSquare());
    }

    public LinearRegression(double[][] data, double xMax, double yMax) {
        this(data);
        this.xMax = xMax;
        this.yMax = yMax;
        setY();
    }

    public void setY() {
        y = roundedUtil(slope * xMax + intercept);
    }

    // 保留小数点后4位  四舍五入
    public double roundedUtil(Double num) {
        if (num.equals(Double.NaN))
            return 0.0d;
        return new java.math.BigDecimal(num).setScale(4, java.math.BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}