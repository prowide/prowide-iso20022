
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
 * Content of the Diagnosis Response message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosisResponse3", propOrder = {
    "lggdSaleId",
    "poiSts",
    "hstSts"
})
public class DiagnosisResponse3 {

    @XmlElement(name = "LggdSaleId")
    protected List<String> lggdSaleId;
    @XmlElement(name = "POISts")
    protected StatusReportContent10 poiSts;
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
     *     {@link StatusReportContent10 }
     *     
     */
    public StatusReportContent10 getPOISts() {
        return poiSts;
    }

    /**
     * Sets the value of the poiSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReportContent10 }
     *     
     */
    public DiagnosisResponse3 setPOISts(StatusReportContent10 value) {
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
    public DiagnosisResponse3 addLggdSaleId(String lggdSaleId) {
        getLggdSaleId().add(lggdSaleId);
        return this;
    }

    /**
     * Adds a new item to the hstSts list.
     * @see #getHstSts()
     * 
     */
    public DiagnosisResponse3 addHstSts(HostStatus1 hstSts) {
        getHstSts().add(hstSts);
        return this;
    }

}
