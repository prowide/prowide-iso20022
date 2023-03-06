
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides the financial instruments details or the business error.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityOrBusinessError4Choice", propOrder = {
    "sctyRpt",
    "bizErr"
})
public class SecurityOrBusinessError4Choice {

    @XmlElement(name = "SctyRpt")
    protected List<SecurityAttributes11> sctyRpt;
    @XmlElement(name = "BizErr")
    protected List<BusinessError4> bizErr;

    /**
     * Gets the value of the sctyRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctyRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctyRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityAttributes11 }
     * 
     * 
     */
    public List<SecurityAttributes11> getSctyRpt() {
        if (sctyRpt == null) {
            sctyRpt = new ArrayList<SecurityAttributes11>();
        }
        return this.sctyRpt;
    }

    /**
     * Gets the value of the bizErr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bizErr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBizErr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessError4 }
     * 
     * 
     */
    public List<BusinessError4> getBizErr() {
        if (bizErr == null) {
            bizErr = new ArrayList<BusinessError4>();
        }
        return this.bizErr;
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
     * Adds a new item to the sctyRpt list.
     * @see #getSctyRpt()
     * 
     */
    public SecurityOrBusinessError4Choice addSctyRpt(SecurityAttributes11 sctyRpt) {
        getSctyRpt().add(sctyRpt);
        return this;
    }

    /**
     * Adds a new item to the bizErr list.
     * @see #getBizErr()
     * 
     */
    public SecurityOrBusinessError4Choice addBizErr(BusinessError4 bizErr) {
        getBizErr().add(bizErr);
        return this;
    }

}
