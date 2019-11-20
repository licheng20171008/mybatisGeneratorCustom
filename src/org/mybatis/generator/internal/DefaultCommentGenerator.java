package org.mybatis.generator.internal;

import static org.mybatis.generator.internal.util.StringUtility.isTrue;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.InnerEnum;
import org.mybatis.generator.api.dom.java.JavaElement;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.MergeConstants;
import org.mybatis.generator.config.PropertyRegistry;

public class DefaultCommentGenerator implements CommentGenerator {

    private Properties properties;
    private boolean suppressDate;

    public DefaultCommentGenerator() {
        super();
        properties = new Properties();
        suppressDate = false;
    }

    /**
     * 给Java文件加注释，这个注释是在文件的顶部，也就是package上面
     */
    public void addJavaFileComment(CompilationUnit compilationUnit) {
    }

    /**
     * 给生成的XML文件加注释，mapper中我就不增加注释，将方法内容清空
     */
    public void addComment(XmlElement xmlElement) {
    }

    public void addRootComment(XmlElement rootElement) {
        // add no document level comments by default
        return;
    }

    public void addConfigurationProperties(Properties properties) {
        this.properties.putAll(properties);

        suppressDate = isTrue(properties
                .getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_DATE));
    }

    /**
     * This method adds the custom javadoc tag for. You may do nothing if you do
     * not wish to include the Javadoc tag - however, if you do not include the
     * Javadoc tag then the Java merge capability of the eclipse plugin will
     * break.
     * 
     * @param javaElement
     *            the java element
     */
    protected void addJavadocTag(JavaElement javaElement,
            boolean markAsDoNotDelete) {
        javaElement.addJavaDocLine(" *"); //$NON-NLS-1$
        StringBuilder sb = new StringBuilder();
        sb.append(" * "); //$NON-NLS-1$
        sb.append(MergeConstants.NEW_ELEMENT_TAG);
        if (markAsDoNotDelete) {
            sb.append(" do_not_delete_during_merge"); //$NON-NLS-1$
        }
        String s = getDateString();
        if (s != null) {
            sb.append(' ');
            sb.append(s);
        }
        javaElement.addJavaDocLine(sb.toString());
    }

    /**
     * This method returns a formated date string to include in the Javadoc tag
     * and XML comments. You may return null if you do not want the date in
     * these documentation elements.
     * 
     * @return a string representing the current timestamp, or null
     */
    protected String getDateString() {
        if (suppressDate) {
            return null;
        } else {
            return new Date().toString();
        }
    }

    /**
     * Java类的注释
     * 此处，我在FullyQualifiedTable类中增加了remark字段，用来保存表的注释信息
     * 在org.mybatis.generator.internal.db.DatabaseIntrospector这个类中610行，增加了获取
     * 表注释信息并将其设置到FullyQualifiedTable中
     */
    public void addClassComment(InnerClass innerClass,
            IntrospectedTable introspectedTable) {
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		innerClass.addJavaDocLine("/**");
		innerClass.addJavaDocLine(" * " + introspectedTable.getFullyQualifiedTable().getRemark());
		innerClass.addJavaDocLine(" * ");
		innerClass.addJavaDocLine(" * @author licheng");
		innerClass.addJavaDocLine(" * ");
		innerClass.addJavaDocLine(" * @date " + sdf.format(new Date()));
		innerClass.addJavaDocLine(" */");
    }

    public void addEnumComment(InnerEnum innerEnum,
            IntrospectedTable introspectedTable) {
    }

    /**
     * java属性的注释,数据库表中注释为空就不给属性增加注释
     */
    public void addFieldComment(Field field,
            IntrospectedTable introspectedTable,
            IntrospectedColumn introspectedColumn) {
    	if (introspectedColumn.getRemarks() != null
				&& !"".equals(introspectedColumn.getRemarks())) {
			field.addJavaDocLine("/**");
			field.addJavaDocLine(" * " + introspectedColumn.getRemarks());
			field.addJavaDocLine(" */");
		}
    }

    public void addFieldComment(Field field, IntrospectedTable introspectedTable) {
    }

    public void addGeneralMethodComment(Method method,
            IntrospectedTable introspectedTable) {
    }

    /**
     * 给getter方法加注释。这里添加注释的方法和Field一样
     * 	此处我就不为getter方法增加注释，将该方法内容清空
     */
    public void addGetterComment(Method method,
            IntrospectedTable introspectedTable,
            IntrospectedColumn introspectedColumn) {
    }

    /**
     * 给setter方法加注释。这里添加注释的方法和Field一样
     * 	此处我就不为setter方法增加注释，将该方法内容清空
     */
    public void addSetterComment(Method method,
            IntrospectedTable introspectedTable,
            IntrospectedColumn introspectedColumn) {
    }

    public void addClassComment(InnerClass innerClass,
            IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {
    }
}
