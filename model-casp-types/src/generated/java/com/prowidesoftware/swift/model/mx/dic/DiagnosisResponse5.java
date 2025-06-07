
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
 * Content of the diagnosis response message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosisResponse5", propOrder = {
    "lggdSaleId",
    "poiSts",
    "hstSts"
})
public class DiagnosisResponse5 {

    @XmlElement(name = "LggdSaleId")
    protected List<String> lggdSaleId;
    @XmlElement(name = "POISts")
    protected StatusReportContent12 poiSts;
    @XmlElement(name = "HstSts")
    protected List<HostStatus1> hstSts;

    /**
     * Gets the value of the lggdSaleId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lggdSaleId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLggdSaleId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLggdSaleId() {
        if (lggdSaleId == null) {
            lggdSaleId = new ArrayList<String>();
        }
        return this.lggdSaleId;
    }

    /**
     * Gets the value of the poiSts property.
     * 
     * @return
     *     possible object is
     *     {@link StatusReportContent12 }
     *     
     */
    public StatusReportContent12 getPOISts() {
        return poiSts;
    }

    /**
     * Sets the value of the poiSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReportContent12 }
     *     
     */
    public DiagnosisResponse5 setPOISts(StatusReportContent12 value) {
        this.poiSts = value;
        return this;
    }

    /**
     * Gets the value of the hstSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hstSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHstSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostStatus1 }
     * 
     * 
     */
    public List<HostStatus1> getHstSts() {
        if (hstSts == null) {
            hstSts = new ArrayList<HostStatus1>();
        }
        return this.hstSts;
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
     * Adds a new item to the lggdSaleId list.
     * @see #getLggdSaleId()
     * 
     */
    public DiagnosisResponse5 addLggdSaleId(String lggdSaleId) {
        getLggdSaleId().add(lggdSaleId);
        return this;
    }

    /**
     * Adds a new item to the hstSts list.
     * @see #getHstSts()
     * 
     */
    public DiagnosisResponse5 addHstSts(HostStatus1 hstSts) {
        getHstSts().add(hstSts);
        return this;
    }

}
