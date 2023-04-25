
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
 * The InvestorRegulatoryDataReport is sent from a system participant to the system to request the system to pass tax information on to the relevant third party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestorRegulatoryDataReportV01", propOrder = {
    "ref",
    "initgPty",
    "finInstrmId",
    "sfkpgAcct",
    "ptyId",
    "resdcyInd",
    "splmtryData"
})
public class InvestorRegulatoryDataReportV01 {

    @XmlElement(name = "Ref")
    protected Identification25 ref;
    @XmlElement(name = "InitgPty")
    protected PartyIdentification71Choice initgPty;
    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "SfkpgAcct", required = true)
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "PtyId")
    protected List<PartyIdentification130> ptyId;
    @XmlElement(name = "ResdcyInd")
    protected TaxResidencyType3Choice resdcyInd;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link Identification25 }
     *     
     */
    public Identification25 getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identification25 }
     *     
     */
    public InvestorRegulatoryDataReportV01 setRef(Identification25 value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the initgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification71Choice }
     *     
     */
    public PartyIdentification71Choice getInitgPty() {
        return initgPty;
    }

    /**
     * Sets the value of the initgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification71Choice }
     *     
     */
    public InvestorRegulatoryDataReportV01 setInitgPty(PartyIdentification71Choice value) {
        this.initgPty = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public InvestorRegulatoryDataReportV01 setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public InvestorRegulatoryDataReportV01 setSfkpgAcct(SecuritiesAccount19 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the ptyId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ptyId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPtyId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification130 }
     * 
     * 
     * @return
     *     The value of the ptyId property.
     */
    public List<PartyIdentification130> getPtyId() {
        if (ptyId == null) {
            ptyId = new ArrayList<>();
        }
        return this.ptyId;
    }

    /**
     * Gets the value of the resdcyInd property.
     * 
     * @return
     *     possible object is
     *     {@link TaxResidencyType3Choice }
     *     
     */
    public TaxResidencyType3Choice getResdcyInd() {
        return resdcyInd;
    }

    /**
     * Sets the value of the resdcyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxResidencyType3Choice }
     *     
     */
    public InvestorRegulatoryDataReportV01 setResdcyInd(TaxResidencyType3Choice value) {
        this.resdcyInd = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
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
     * Adds a new item to the ptyId list.
     * @see #getPtyId()
     * 
     */
    public InvestorRegulatoryDataReportV01 addPtyId(PartyIdentification130 ptyId) {
        getPtyId().add(ptyId);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public InvestorRegulatoryDataReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
