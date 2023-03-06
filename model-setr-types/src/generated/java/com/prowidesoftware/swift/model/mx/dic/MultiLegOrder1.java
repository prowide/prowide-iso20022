
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides details about the multileg order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiLegOrder1", propOrder = {
    "rptTpReq",
    "ordrDtls",
    "legGrpDtls"
})
public class MultiLegOrder1 {

    @XmlElement(name = "RptTpReq")
    @XmlSchemaType(name = "string")
    protected MultilegReportType1Code rptTpReq;
    @XmlElement(name = "OrdrDtls", required = true)
    protected Order3 ordrDtls;
    @XmlElement(name = "LegGrpDtls")
    protected List<InstrumentLeg3> legGrpDtls;

    /**
     * Gets the value of the rptTpReq property.
     * 
     * @return
     *     possible object is
     *     {@link MultilegReportType1Code }
     *     
     */
    public MultilegReportType1Code getRptTpReq() {
        return rptTpReq;
    }

    /**
     * Sets the value of the rptTpReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilegReportType1Code }
     *     
     */
    public MultiLegOrder1 setRptTpReq(MultilegReportType1Code value) {
        this.rptTpReq = value;
        return this;
    }

    /**
     * Gets the value of the ordrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Order3 }
     *     
     */
    public Order3 getOrdrDtls() {
        return ordrDtls;
    }

    /**
     * Sets the value of the ordrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order3 }
     *     
     */
    public MultiLegOrder1 setOrdrDtls(Order3 value) {
        this.ordrDtls = value;
        return this;
    }

    /**
     * Gets the value of the legGrpDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legGrpDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegGrpDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstrumentLeg3 }
     * 
     * 
     */
    public List<InstrumentLeg3> getLegGrpDtls() {
        if (legGrpDtls == null) {
            legGrpDtls = new ArrayList<InstrumentLeg3>();
        }
        return this.legGrpDtls;
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
     * Adds a new item to the legGrpDtls list.
     * @see #getLegGrpDtls()
     * 
     */
    public MultiLegOrder1 addLegGrpDtls(InstrumentLeg3 legGrpDtls) {
        getLegGrpDtls().add(legGrpDtls);
        return this;
    }

}
