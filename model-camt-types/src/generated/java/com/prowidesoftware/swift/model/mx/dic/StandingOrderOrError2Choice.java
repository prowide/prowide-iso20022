
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
 * Choice between the standing order details or a business error when the requested data cannot be retrieved.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingOrderOrError2Choice", propOrder = {
    "stgOrdr",
    "bizErr"
})
public class StandingOrderOrError2Choice {

    @XmlElement(name = "StgOrdr")
    protected StandingOrder2 stgOrdr;
    @XmlElement(name = "BizErr")
    protected List<ErrorHandling3> bizErr;

    /**
     * Gets the value of the stgOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link StandingOrder2 }
     *     
     */
    public StandingOrder2 getStgOrdr() {
        return stgOrdr;
    }

    /**
     * Sets the value of the stgOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingOrder2 }
     *     
     */
    public StandingOrderOrError2Choice setStgOrdr(StandingOrder2 value) {
        this.stgOrdr = value;
        return this;
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
     * {@link ErrorHandling3 }
     * 
     * 
     */
    public List<ErrorHandling3> getBizErr() {
        if (bizErr == null) {
            bizErr = new ArrayList<ErrorHandling3>();
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
     * Adds a new item to the bizErr list.
     * @see #getBizErr()
     * 
     */
    public StandingOrderOrError2Choice addBizErr(ErrorHandling3 bizErr) {
        getBizErr().add(bizErr);
        return this;
    }

}
