
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
 * Detailed information on statistics per combination of counterparties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedStatisticsPerCounterparty6", propOrder = {
    "rptgPrd",
    "ctrPtyId",
    "rjctnSttstcs",
    "cmptntAuthrty"
})
public class DetailedStatisticsPerCounterparty6 {

    @XmlElement(name = "RptgPrd", required = true)
    protected Period2 rptgPrd;
    @XmlElement(name = "CtrPtyId", required = true)
    protected CounterpartyData36 ctrPtyId;
    @XmlElement(name = "RjctnSttstcs", required = true)
    protected RejectionStatistics3 rjctnSttstcs;
    @XmlElement(name = "CmptntAuthrty")
    protected List<CompetentAuthority1> cmptntAuthrty;

    /**
     * Gets the value of the rptgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period2 }
     *     
     */
    public Period2 getRptgPrd() {
        return rptgPrd;
    }

    /**
     * Sets the value of the rptgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period2 }
     *     
     */
    public DetailedStatisticsPerCounterparty6 setRptgPrd(Period2 value) {
        this.rptgPrd = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyData36 }
     *     
     */
    public CounterpartyData36 getCtrPtyId() {
        return ctrPtyId;
    }

    /**
     * Sets the value of the ctrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyData36 }
     *     
     */
    public DetailedStatisticsPerCounterparty6 setCtrPtyId(CounterpartyData36 value) {
        this.ctrPtyId = value;
        return this;
    }

    /**
     * Gets the value of the rjctnSttstcs property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionStatistics3 }
     *     
     */
    public RejectionStatistics3 getRjctnSttstcs() {
        return rjctnSttstcs;
    }

    /**
     * Sets the value of the rjctnSttstcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionStatistics3 }
     *     
     */
    public DetailedStatisticsPerCounterparty6 setRjctnSttstcs(RejectionStatistics3 value) {
        this.rjctnSttstcs = value;
        return this;
    }

    /**
     * Gets the value of the cmptntAuthrty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cmptntAuthrty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmptntAuthrty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompetentAuthority1 }
     * 
     * 
     */
    public List<CompetentAuthority1> getCmptntAuthrty() {
        if (cmptntAuthrty == null) {
            cmptntAuthrty = new ArrayList<CompetentAuthority1>();
        }
        return this.cmptntAuthrty;
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
     * Adds a new item to the cmptntAuthrty list.
     * @see #getCmptntAuthrty()
     * 
     */
    public DetailedStatisticsPerCounterparty6 addCmptntAuthrty(CompetentAuthority1 cmptntAuthrty) {
        getCmptntAuthrty().add(cmptntAuthrty);
        return this;
    }

}
