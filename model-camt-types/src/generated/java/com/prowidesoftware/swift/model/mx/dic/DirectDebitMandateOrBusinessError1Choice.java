
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
 * Choice between the audit trail or a business error when the requested data cannot be retrieved.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebitMandateOrBusinessError1Choice", propOrder = {
    "drctDbtMndt",
    "bizErr"
})
public class DirectDebitMandateOrBusinessError1Choice {

    @XmlElement(name = "DrctDbtMndt")
    protected List<DirectDebitMandateData1> drctDbtMndt;
    @XmlElement(name = "BizErr")
    protected List<ErrorHandling4> bizErr;

    /**
     * Gets the value of the drctDbtMndt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drctDbtMndt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrctDbtMndt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectDebitMandateData1 }
     * 
     * 
     */
    public List<DirectDebitMandateData1> getDrctDbtMndt() {
        if (drctDbtMndt == null) {
            drctDbtMndt = new ArrayList<DirectDebitMandateData1>();
        }
        return this.drctDbtMndt;
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
     * {@link ErrorHandling4 }
     * 
     * 
     */
    public List<ErrorHandling4> getBizErr() {
        if (bizErr == null) {
            bizErr = new ArrayList<ErrorHandling4>();
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
     * Adds a new item to the drctDbtMndt list.
     * @see #getDrctDbtMndt()
     * 
     */
    public DirectDebitMandateOrBusinessError1Choice addDrctDbtMndt(DirectDebitMandateData1 drctDbtMndt) {
        getDrctDbtMndt().add(drctDbtMndt);
        return this;
    }

    /**
     * Adds a new item to the bizErr list.
     * @see #getBizErr()
     * 
     */
    public DirectDebitMandateOrBusinessError1Choice addBizErr(ErrorHandling4 bizErr) {
        getBizErr().add(bizErr);
        return this;
    }

}
