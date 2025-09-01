
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
 * It is used to provide some or all of the members with information related to the processing of the system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralBusinessOrError3Choice", propOrder = {
    "oprlErr",
    "bizRpt"
})
public class GeneralBusinessOrError3Choice {

    @XmlElement(name = "OprlErr")
    protected List<ErrorHandling4> oprlErr;
    @XmlElement(name = "BizRpt")
    protected List<GeneralBusinessReport4> bizRpt;

    /**
     * Gets the value of the oprlErr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oprlErr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOprlErr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorHandling4 }
     * 
     * 
     */
    public List<ErrorHandling4> getOprlErr() {
        if (oprlErr == null) {
            oprlErr = new ArrayList<ErrorHandling4>();
        }
        return this.oprlErr;
    }

    /**
     * Gets the value of the bizRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bizRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBizRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralBusinessReport4 }
     * 
     * 
     */
    public List<GeneralBusinessReport4> getBizRpt() {
        if (bizRpt == null) {
            bizRpt = new ArrayList<GeneralBusinessReport4>();
        }
        return this.bizRpt;
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
     * Adds a new item to the oprlErr list.
     * @see #getOprlErr()
     * 
     */
    public GeneralBusinessOrError3Choice addOprlErr(ErrorHandling4 oprlErr) {
        getOprlErr().add(oprlErr);
        return this;
    }

    /**
     * Adds a new item to the bizRpt list.
     * @see #getBizRpt()
     * 
     */
    public GeneralBusinessOrError3Choice addBizRpt(GeneralBusinessReport4 bizRpt) {
        getBizRpt().add(bizRpt);
        return this;
    }

}
