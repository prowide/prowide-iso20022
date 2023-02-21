
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
 * Specifies information about blocked accounts.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Blocked1", propOrder = {
    "ordrTp",
    "blckd",
    "rsn"
})
public class Blocked1 {

    @XmlElement(name = "OrdrTp", required = true)
    protected List<FundOrderType1Choice> ordrTp;
    @XmlElement(name = "Blckd")
    protected boolean blckd;
    @XmlElement(name = "Rsn")
    protected BlockedReason1Choice rsn;

    /**
     * Gets the value of the ordrTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ordrTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdrTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundOrderType1Choice }
     * 
     * 
     */
    public List<FundOrderType1Choice> getOrdrTp() {
        if (ordrTp == null) {
            ordrTp = new ArrayList<FundOrderType1Choice>();
        }
        return this.ordrTp;
    }

    /**
     * Gets the value of the blckd property.
     * 
     */
    public boolean isBlckd() {
        return blckd;
    }

    /**
     * Sets the value of the blckd property.
     * 
     */
    public Blocked1 setBlckd(boolean value) {
        this.blckd = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link BlockedReason1Choice }
     *     
     */
    public BlockedReason1Choice getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockedReason1Choice }
     *     
     */
    public Blocked1 setRsn(BlockedReason1Choice value) {
        this.rsn = value;
        return this;
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
     * Adds a new item to the ordrTp list.
     * @see #getOrdrTp()
     * 
     */
    public Blocked1 addOrdrTp(FundOrderType1Choice ordrTp) {
        getOrdrTp().add(ordrTp);
        return this;
    }

}
