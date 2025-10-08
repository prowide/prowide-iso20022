
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Limit details of one particular limit set by the member and managed by the transaction administrator.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitDetailsStructure3", propOrder = {
    "curLmtId",
    "allCurLmts"
})
public class LimitDetailsStructure3 {

    @XmlElement(name = "CurLmtId")
    protected List<LimitIdentificationDetails2> curLmtId;
    @XmlElement(name = "AllCurLmts")
    protected List<LimitIdentificationDetails3> allCurLmts;

    /**
     * Gets the value of the curLmtId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the curLmtId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurLmtId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LimitIdentificationDetails2 }
     * 
     * 
     */
    public List<LimitIdentificationDetails2> getCurLmtId() {
        if (curLmtId == null) {
            curLmtId = new ArrayList<LimitIdentificationDetails2>();
        }
        return this.curLmtId;
    }

    /**
     * Gets the value of the allCurLmts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allCurLmts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllCurLmts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LimitIdentificationDetails3 }
     * 
     * 
     */
    public List<LimitIdentificationDetails3> getAllCurLmts() {
        if (allCurLmts == null) {
            allCurLmts = new ArrayList<LimitIdentificationDetails3>();
        }
        return this.allCurLmts;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the curLmtId list.
     * @see #getCurLmtId()
     * 
     */
    public LimitDetailsStructure3 addCurLmtId(LimitIdentificationDetails2 curLmtId) {
        getCurLmtId().add(curLmtId);
        return this;
    }

    /**
     * Adds a new item to the allCurLmts list.
     * @see #getAllCurLmts()
     * 
     */
    public LimitDetailsStructure3 addAllCurLmts(LimitIdentificationDetails3 allCurLmts) {
        getAllCurLmts().add(allCurLmts);
        return this;
    }

}
