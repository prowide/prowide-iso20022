
package com.prowidesoftware.swift.model.mx.dic;

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
 * Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, for example, dividend option or valuation currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrument56", propOrder = {
    "id",
    "nm",
    "shrtNm",
    "splmtryId",
    "clssTp",
    "sctiesForm",
    "dstrbtnPlcy",
    "pdctGrp",
    "blckdHldgDtls",
    "pldgg",
    "coll",
    "thrdPtyRghts",
    "fndOwnrsh",
    "fndIntntn",
    "oprlSts"
})
public class FinancialInstrument56 {

    @XmlElement(name = "Id", required = true)
    protected SecurityIdentification25Choice id;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "ShrtNm")
    protected String shrtNm;
    @XmlElement(name = "SplmtryId")
    protected String splmtryId;
    @XmlElement(name = "ClssTp")
    protected String clssTp;
    @XmlElement(name = "SctiesForm")
    @XmlSchemaType(name = "string")
    protected FormOfSecurity1Code sctiesForm;
    @XmlElement(name = "DstrbtnPlcy")
    @XmlSchemaType(name = "string")
    protected DistributionPolicy1Code dstrbtnPlcy;
    @XmlElement(name = "PdctGrp")
    protected String pdctGrp;
    @XmlElement(name = "BlckdHldgDtls")
    protected BlockedHoldingDetails2 blckdHldgDtls;
    @XmlElement(name = "Pldgg")
    @XmlSchemaType(name = "string")
    protected Eligible1Code pldgg;
    @XmlElement(name = "Coll")
    @XmlSchemaType(name = "string")
    protected Collateral1Code coll;
    @XmlElement(name = "ThrdPtyRghts")
    protected ThirdPartyRights1 thrdPtyRghts;
    @XmlElement(name = "FndOwnrsh")
    @XmlSchemaType(name = "string")
    protected FundOwnership1Code fndOwnrsh;
    @XmlElement(name = "FndIntntn")
    @XmlSchemaType(name = "string")
    protected FundIntention1Code fndIntntn;
    @XmlElement(name = "OprlSts")
    @XmlSchemaType(name = "string")
    protected OperationalStatus1Code oprlSts;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification25Choice }
     *     
     */
    public SecurityIdentification25Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification25Choice }
     *     
     */
    public FinancialInstrument56 setId(SecurityIdentification25Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument56 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the shrtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrtNm() {
        return shrtNm;
    }

    /**
     * Sets the value of the shrtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument56 setShrtNm(String value) {
        this.shrtNm = value;
        return this;
    }

    /**
     * Gets the value of the splmtryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplmtryId() {
        return splmtryId;
    }

    /**
     * Sets the value of the splmtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument56 setSplmtryId(String value) {
        this.splmtryId = value;
        return this;
    }

    /**
     * Gets the value of the clssTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClssTp() {
        return clssTp;
    }

    /**
     * Sets the value of the clssTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument56 setClssTp(String value) {
        this.clssTp = value;
        return this;
    }

    /**
     * Gets the value of the sctiesForm property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfSecurity1Code }
     *     
     */
    public FormOfSecurity1Code getSctiesForm() {
        return sctiesForm;
    }

    /**
     * Sets the value of the sctiesForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfSecurity1Code }
     *     
     */
    public FinancialInstrument56 setSctiesForm(FormOfSecurity1Code value) {
        this.sctiesForm = value;
        return this;
    }

    /**
     * Gets the value of the dstrbtnPlcy property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionPolicy1Code }
     *     
     */
    public DistributionPolicy1Code getDstrbtnPlcy() {
        return dstrbtnPlcy;
    }

    /**
     * Sets the value of the dstrbtnPlcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionPolicy1Code }
     *     
     */
    public FinancialInstrument56 setDstrbtnPlcy(DistributionPolicy1Code value) {
        this.dstrbtnPlcy = value;
        return this;
    }

    /**
     * Gets the value of the pdctGrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctGrp() {
        return pdctGrp;
    }

    /**
     * Sets the value of the pdctGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument56 setPdctGrp(String value) {
        this.pdctGrp = value;
        return this;
    }

    /**
     * Gets the value of the blckdHldgDtls property.
     * 
     * @return
     *     possible object is
     *     {@link BlockedHoldingDetails2 }
     *     
     */
    public BlockedHoldingDetails2 getBlckdHldgDtls() {
        return blckdHldgDtls;
    }

    /**
     * Sets the value of the blckdHldgDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockedHoldingDetails2 }
     *     
     */
    public FinancialInstrument56 setBlckdHldgDtls(BlockedHoldingDetails2 value) {
        this.blckdHldgDtls = value;
        return this;
    }

    /**
     * Gets the value of the pldgg property.
     * 
     * @return
     *     possible object is
     *     {@link Eligible1Code }
     *     
     */
    public Eligible1Code getPldgg() {
        return pldgg;
    }

    /**
     * Sets the value of the pldgg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Eligible1Code }
     *     
     */
    public FinancialInstrument56 setPldgg(Eligible1Code value) {
        this.pldgg = value;
        return this;
    }

    /**
     * Gets the value of the coll property.
     * 
     * @return
     *     possible object is
     *     {@link Collateral1Code }
     *     
     */
    public Collateral1Code getColl() {
        return coll;
    }

    /**
     * Sets the value of the coll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collateral1Code }
     *     
     */
    public FinancialInstrument56 setColl(Collateral1Code value) {
        this.coll = value;
        return this;
    }

    /**
     * Gets the value of the thrdPtyRghts property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyRights1 }
     *     
     */
    public ThirdPartyRights1 getThrdPtyRghts() {
        return thrdPtyRghts;
    }

    /**
     * Sets the value of the thrdPtyRghts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyRights1 }
     *     
     */
    public FinancialInstrument56 setThrdPtyRghts(ThirdPartyRights1 value) {
        this.thrdPtyRghts = value;
        return this;
    }

    /**
     * Gets the value of the fndOwnrsh property.
     * 
     * @return
     *     possible object is
     *     {@link FundOwnership1Code }
     *     
     */
    public FundOwnership1Code getFndOwnrsh() {
        return fndOwnrsh;
    }

    /**
     * Sets the value of the fndOwnrsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundOwnership1Code }
     *     
     */
    public FinancialInstrument56 setFndOwnrsh(FundOwnership1Code value) {
        this.fndOwnrsh = value;
        return this;
    }

    /**
     * Gets the value of the fndIntntn property.
     * 
     * @return
     *     possible object is
     *     {@link FundIntention1Code }
     *     
     */
    public FundIntention1Code getFndIntntn() {
        return fndIntntn;
    }

    /**
     * Sets the value of the fndIntntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundIntention1Code }
     *     
     */
    public FinancialInstrument56 setFndIntntn(FundIntention1Code value) {
        this.fndIntntn = value;
        return this;
    }

    /**
     * Gets the value of the oprlSts property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalStatus1Code }
     *     
     */
    public OperationalStatus1Code getOprlSts() {
        return oprlSts;
    }

    /**
     * Sets the value of the oprlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalStatus1Code }
     *     
     */
    public FinancialInstrument56 setOprlSts(OperationalStatus1Code value) {
        this.oprlSts = value;
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

}
