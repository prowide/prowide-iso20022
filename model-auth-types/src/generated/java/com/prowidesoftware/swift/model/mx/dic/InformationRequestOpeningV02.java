
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
 * This message is sent by the authorities (police, customs, tax authorities, enforcement authorities) to a financial institution to request account and other banking and financial information. Requested information can relate to accounts, their signatories and beneficiaries and co-owners as well as movements plus positions on these accounts.
 * 
 * Requests are underpinned by specific legal texts.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformationRequestOpeningV02", propOrder = {
    "invstgtnId",
    "lglMndtBsis",
    "cnfdtltySts",
    "dueDt",
    "invstgtnPrd",
    "schCrit",
    "splmtryData"
})
public class InformationRequestOpeningV02 {

    @XmlElement(name = "InvstgtnId", required = true)
    protected String invstgtnId;
    @XmlElement(name = "LglMndtBsis", required = true)
    protected LegalMandate1 lglMndtBsis;
    @XmlElement(name = "CnfdtltySts")
    protected boolean cnfdtltySts;
    @XmlElement(name = "DueDt")
    protected DueDate1 dueDt;
    @XmlElement(name = "InvstgtnPrd", required = true)
    protected DateOrDateTimePeriod1Choice invstgtnPrd;
    @XmlElement(name = "SchCrit", required = true)
    protected SearchCriteria2Choice schCrit;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the invstgtnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvstgtnId() {
        return invstgtnId;
    }

    /**
     * Sets the value of the invstgtnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InformationRequestOpeningV02 setInvstgtnId(String value) {
        this.invstgtnId = value;
        return this;
    }

    /**
     * Gets the value of the lglMndtBsis property.
     * 
     * @return
     *     possible object is
     *     {@link LegalMandate1 }
     *     
     */
    public LegalMandate1 getLglMndtBsis() {
        return lglMndtBsis;
    }

    /**
     * Sets the value of the lglMndtBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalMandate1 }
     *     
     */
    public InformationRequestOpeningV02 setLglMndtBsis(LegalMandate1 value) {
        this.lglMndtBsis = value;
        return this;
    }

    /**
     * Gets the value of the cnfdtltySts property.
     * 
     */
    public boolean isCnfdtltySts() {
        return cnfdtltySts;
    }

    /**
     * Sets the value of the cnfdtltySts property.
     * 
     */
    public InformationRequestOpeningV02 setCnfdtltySts(boolean value) {
        this.cnfdtltySts = value;
        return this;
    }

    /**
     * Gets the value of the dueDt property.
     * 
     * @return
     *     possible object is
     *     {@link DueDate1 }
     *     
     */
    public DueDate1 getDueDt() {
        return dueDt;
    }

    /**
     * Sets the value of the dueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DueDate1 }
     *     
     */
    public InformationRequestOpeningV02 setDueDt(DueDate1 value) {
        this.dueDt = value;
        return this;
    }

    /**
     * Gets the value of the invstgtnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateOrDateTimePeriod1Choice }
     *     
     */
    public DateOrDateTimePeriod1Choice getInvstgtnPrd() {
        return invstgtnPrd;
    }

    /**
     * Sets the value of the invstgtnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOrDateTimePeriod1Choice }
     *     
     */
    public InformationRequestOpeningV02 setInvstgtnPrd(DateOrDateTimePeriod1Choice value) {
        this.invstgtnPrd = value;
        return this;
    }

    /**
     * Gets the value of the schCrit property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteria2Choice }
     *     
     */
    public SearchCriteria2Choice getSchCrit() {
        return schCrit;
    }

    /**
     * Sets the value of the schCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteria2Choice }
     *     
     */
    public InformationRequestOpeningV02 setSchCrit(SearchCriteria2Choice value) {
        this.schCrit = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
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
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public InformationRequestOpeningV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
