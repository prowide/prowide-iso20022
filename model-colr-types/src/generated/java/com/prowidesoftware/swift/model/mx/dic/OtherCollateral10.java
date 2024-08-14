
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.LocalDate;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides details about the letter of credit or bank guarantee, or other collateral, posted as collateral.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherCollateral10", propOrder = {
    "asstNb",
    "lttrOfCdtId",
    "lttrOfCdtAmt",
    "grntAmt",
    "othrTpOfColl",
    "collOwnrsh",
    "isseDt",
    "xpryDt",
    "ltdCvrgInd",
    "issr",
    "blckdQty",
    "valDt",
    "xchgRate",
    "mktVal",
    "hrcut",
    "collVal",
    "sfkpgPlc",
    "sfkpgAcct",
    "blckChainAdrOrWllt"
})
public class OtherCollateral10 {

    @XmlElement(name = "AsstNb")
    protected String asstNb;
    @XmlElement(name = "LttrOfCdtId")
    protected String lttrOfCdtId;
    @XmlElement(name = "LttrOfCdtAmt")
    protected ActiveCurrencyAndAmount lttrOfCdtAmt;
    @XmlElement(name = "GrntAmt")
    protected ActiveCurrencyAndAmount grntAmt;
    @XmlElement(name = "OthrTpOfColl")
    protected OtherTypeOfCollateral3 othrTpOfColl;
    @XmlElement(name = "CollOwnrsh")
    protected CollateralOwnership3 collOwnrsh;
    @XmlElement(name = "IsseDt")
    protected DateFormat14Choice isseDt;
    @XmlElement(name = "XpryDt")
    protected DateFormat14Choice xpryDt;
    @XmlElement(name = "LtdCvrgInd")
    protected Boolean ltdCvrgInd;
    @XmlElement(name = "Issr")
    protected PartyIdentification178Choice issr;
    @XmlElement(name = "BlckdQty")
    protected FinancialInstrumentQuantity33Choice blckdQty;
    @XmlElement(name = "ValDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate valDt;
    @XmlElement(name = "XchgRate")
    protected BigDecimal xchgRate;
    @XmlElement(name = "MktVal")
    protected ActiveCurrencyAndAmount mktVal;
    @XmlElement(name = "Hrcut")
    protected BigDecimal hrcut;
    @XmlElement(name = "CollVal", required = true)
    protected ActiveCurrencyAndAmount collVal;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat29Choice sfkpgPlc;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet3 blckChainAdrOrWllt;

    /**
     * Gets the value of the asstNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsstNb() {
        return asstNb;
    }

    /**
     * Sets the value of the asstNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OtherCollateral10 setAsstNb(String value) {
        this.asstNb = value;
        return this;
    }

    /**
     * Gets the value of the lttrOfCdtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLttrOfCdtId() {
        return lttrOfCdtId;
    }

    /**
     * Sets the value of the lttrOfCdtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OtherCollateral10 setLttrOfCdtId(String value) {
        this.lttrOfCdtId = value;
        return this;
    }

    /**
     * Gets the value of the lttrOfCdtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getLttrOfCdtAmt() {
        return lttrOfCdtAmt;
    }

    /**
     * Sets the value of the lttrOfCdtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public OtherCollateral10 setLttrOfCdtAmt(ActiveCurrencyAndAmount value) {
        this.lttrOfCdtAmt = value;
        return this;
    }

    /**
     * Gets the value of the grntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getGrntAmt() {
        return grntAmt;
    }

    /**
     * Sets the value of the grntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public OtherCollateral10 setGrntAmt(ActiveCurrencyAndAmount value) {
        this.grntAmt = value;
        return this;
    }

    /**
     * Gets the value of the othrTpOfColl property.
     * 
     * @return
     *     possible object is
     *     {@link OtherTypeOfCollateral3 }
     *     
     */
    public OtherTypeOfCollateral3 getOthrTpOfColl() {
        return othrTpOfColl;
    }

    /**
     * Sets the value of the othrTpOfColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherTypeOfCollateral3 }
     *     
     */
    public OtherCollateral10 setOthrTpOfColl(OtherTypeOfCollateral3 value) {
        this.othrTpOfColl = value;
        return this;
    }

    /**
     * Gets the value of the collOwnrsh property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralOwnership3 }
     *     
     */
    public CollateralOwnership3 getCollOwnrsh() {
        return collOwnrsh;
    }

    /**
     * Sets the value of the collOwnrsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralOwnership3 }
     *     
     */
    public OtherCollateral10 setCollOwnrsh(CollateralOwnership3 value) {
        this.collOwnrsh = value;
        return this;
    }

    /**
     * Gets the value of the isseDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat14Choice }
     *     
     */
    public DateFormat14Choice getIsseDt() {
        return isseDt;
    }

    /**
     * Sets the value of the isseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat14Choice }
     *     
     */
    public OtherCollateral10 setIsseDt(DateFormat14Choice value) {
        this.isseDt = value;
        return this;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat14Choice }
     *     
     */
    public DateFormat14Choice getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat14Choice }
     *     
     */
    public OtherCollateral10 setXpryDt(DateFormat14Choice value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the ltdCvrgInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLtdCvrgInd() {
        return ltdCvrgInd;
    }

    /**
     * Sets the value of the ltdCvrgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public OtherCollateral10 setLtdCvrgInd(Boolean value) {
        this.ltdCvrgInd = value;
        return this;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public PartyIdentification178Choice getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public OtherCollateral10 setIssr(PartyIdentification178Choice value) {
        this.issr = value;
        return this;
    }

    /**
     * Gets the value of the blckdQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public FinancialInstrumentQuantity33Choice getBlckdQty() {
        return blckdQty;
    }

    /**
     * Sets the value of the blckdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public OtherCollateral10 setBlckdQty(FinancialInstrumentQuantity33Choice value) {
        this.blckdQty = value;
        return this;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OtherCollateral10 setValDt(LocalDate value) {
        this.valDt = value;
        return this;
    }

    /**
     * Gets the value of the xchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXchgRate() {
        return xchgRate;
    }

    /**
     * Sets the value of the xchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OtherCollateral10 setXchgRate(BigDecimal value) {
        this.xchgRate = value;
        return this;
    }

    /**
     * Gets the value of the mktVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMktVal() {
        return mktVal;
    }

    /**
     * Sets the value of the mktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public OtherCollateral10 setMktVal(ActiveCurrencyAndAmount value) {
        this.mktVal = value;
        return this;
    }

    /**
     * Gets the value of the hrcut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHrcut() {
        return hrcut;
    }

    /**
     * Sets the value of the hrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OtherCollateral10 setHrcut(BigDecimal value) {
        this.hrcut = value;
        return this;
    }

    /**
     * Gets the value of the collVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCollVal() {
        return collVal;
    }

    /**
     * Sets the value of the collVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public OtherCollateral10 setCollVal(ActiveCurrencyAndAmount value) {
        this.collVal = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat29Choice }
     *     
     */
    public SafekeepingPlaceFormat29Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat29Choice }
     *     
     */
    public OtherCollateral10 setSfkpgPlc(SafekeepingPlaceFormat29Choice value) {
        this.sfkpgPlc = value;
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
    public OtherCollateral10 setSfkpgAcct(SecuritiesAccount19 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the blckChainAdrOrWllt property.
     * 
     * @return
     *     possible object is
     *     {@link BlockChainAddressWallet3 }
     *     
     */
    public BlockChainAddressWallet3 getBlckChainAdrOrWllt() {
        return blckChainAdrOrWllt;
    }

    /**
     * Sets the value of the blckChainAdrOrWllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockChainAddressWallet3 }
     *     
     */
    public OtherCollateral10 setBlckChainAdrOrWllt(BlockChainAddressWallet3 value) {
        this.blckChainAdrOrWllt = value;
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
