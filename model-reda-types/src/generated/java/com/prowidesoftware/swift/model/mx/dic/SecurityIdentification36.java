
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
 * Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, for example, dividend option or valuation currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityIdentification36", propOrder = {
    "id",
    "nm",
    "shrtNm",
    "clssTp",
    "umbrllNm",
    "newUmbrll",
    "clssfctnTp",
    "baseCcy",
    "ctryOfDmcl",
    "regdDstrbtnCtry",
    "lglStr",
    "issr",
    "issrPdctGovncPrc",
    "pdctCtgy",
    "qtnTp",
    "lvrgdOrCntgntLblty",
    "addtlInf"
})
public class SecurityIdentification36 {

    @XmlElement(name = "Id", required = true)
    protected SecurityIdentification19 id;
    @XmlElement(name = "Nm", required = true)
    protected String nm;
    @XmlElement(name = "ShrtNm")
    protected String shrtNm;
    @XmlElement(name = "ClssTp")
    protected String clssTp;
    @XmlElement(name = "UmbrllNm")
    protected String umbrllNm;
    @XmlElement(name = "NewUmbrll")
    protected Boolean newUmbrll;
    @XmlElement(name = "ClssfctnTp")
    protected SecurityClassificationType2Choice clssfctnTp;
    @XmlElement(name = "BaseCcy")
    protected String baseCcy;
    @XmlElement(name = "CtryOfDmcl")
    protected String ctryOfDmcl;
    @XmlElement(name = "RegdDstrbtnCtry")
    protected List<String> regdDstrbtnCtry;
    @XmlElement(name = "LglStr")
    protected LegalStructure1Choice lglStr;
    @XmlElement(name = "Issr")
    protected ContactAttributes5 issr;
    @XmlElement(name = "IssrPdctGovncPrc")
    protected GovernanceProcess1Choice issrPdctGovncPrc;
    @XmlElement(name = "PdctCtgy")
    protected String pdctCtgy;
    @XmlElement(name = "QtnTp")
    protected QuotationType1Choice qtnTp;
    @XmlElement(name = "LvrgdOrCntgntLblty")
    protected Boolean lvrgdOrCntgntLblty;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification36 setId(SecurityIdentification19 value) {
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
    public SecurityIdentification36 setNm(String value) {
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
    public SecurityIdentification36 setShrtNm(String value) {
        this.shrtNm = value;
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
    public SecurityIdentification36 setClssTp(String value) {
        this.clssTp = value;
        return this;
    }

    /**
     * Gets the value of the umbrllNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmbrllNm() {
        return umbrllNm;
    }

    /**
     * Sets the value of the umbrllNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentification36 setUmbrllNm(String value) {
        this.umbrllNm = value;
        return this;
    }

    /**
     * Gets the value of the newUmbrll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewUmbrll() {
        return newUmbrll;
    }

    /**
     * Sets the value of the newUmbrll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecurityIdentification36 setNewUmbrll(Boolean value) {
        this.newUmbrll = value;
        return this;
    }

    /**
     * Gets the value of the clssfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityClassificationType2Choice }
     *     
     */
    public SecurityClassificationType2Choice getClssfctnTp() {
        return clssfctnTp;
    }

    /**
     * Sets the value of the clssfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityClassificationType2Choice }
     *     
     */
    public SecurityIdentification36 setClssfctnTp(SecurityClassificationType2Choice value) {
        this.clssfctnTp = value;
        return this;
    }

    /**
     * Gets the value of the baseCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCcy() {
        return baseCcy;
    }

    /**
     * Sets the value of the baseCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentification36 setBaseCcy(String value) {
        this.baseCcy = value;
        return this;
    }

    /**
     * Gets the value of the ctryOfDmcl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfDmcl() {
        return ctryOfDmcl;
    }

    /**
     * Sets the value of the ctryOfDmcl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentification36 setCtryOfDmcl(String value) {
        this.ctryOfDmcl = value;
        return this;
    }

    /**
     * Gets the value of the regdDstrbtnCtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the regdDstrbtnCtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegdDstrbtnCtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the regdDstrbtnCtry property.
     */
    public List<String> getRegdDstrbtnCtry() {
        if (regdDstrbtnCtry == null) {
            regdDstrbtnCtry = new ArrayList<>();
        }
        return this.regdDstrbtnCtry;
    }

    /**
     * Gets the value of the lglStr property.
     * 
     * @return
     *     possible object is
     *     {@link LegalStructure1Choice }
     *     
     */
    public LegalStructure1Choice getLglStr() {
        return lglStr;
    }

    /**
     * Sets the value of the lglStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalStructure1Choice }
     *     
     */
    public SecurityIdentification36 setLglStr(LegalStructure1Choice value) {
        this.lglStr = value;
        return this;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link ContactAttributes5 }
     *     
     */
    public ContactAttributes5 getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAttributes5 }
     *     
     */
    public SecurityIdentification36 setIssr(ContactAttributes5 value) {
        this.issr = value;
        return this;
    }

    /**
     * Gets the value of the issrPdctGovncPrc property.
     * 
     * @return
     *     possible object is
     *     {@link GovernanceProcess1Choice }
     *     
     */
    public GovernanceProcess1Choice getIssrPdctGovncPrc() {
        return issrPdctGovncPrc;
    }

    /**
     * Sets the value of the issrPdctGovncPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GovernanceProcess1Choice }
     *     
     */
    public SecurityIdentification36 setIssrPdctGovncPrc(GovernanceProcess1Choice value) {
        this.issrPdctGovncPrc = value;
        return this;
    }

    /**
     * Gets the value of the pdctCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctCtgy() {
        return pdctCtgy;
    }

    /**
     * Sets the value of the pdctCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentification36 setPdctCtgy(String value) {
        this.pdctCtgy = value;
        return this;
    }

    /**
     * Gets the value of the qtnTp property.
     * 
     * @return
     *     possible object is
     *     {@link QuotationType1Choice }
     *     
     */
    public QuotationType1Choice getQtnTp() {
        return qtnTp;
    }

    /**
     * Sets the value of the qtnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotationType1Choice }
     *     
     */
    public SecurityIdentification36 setQtnTp(QuotationType1Choice value) {
        this.qtnTp = value;
        return this;
    }

    /**
     * Gets the value of the lvrgdOrCntgntLblty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLvrgdOrCntgntLblty() {
        return lvrgdOrCntgntLblty;
    }

    /**
     * Sets the value of the lvrgdOrCntgntLblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecurityIdentification36 setLvrgdOrCntgntLblty(Boolean value) {
        this.lvrgdOrCntgntLblty = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation15 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
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
     * Adds a new item to the regdDstrbtnCtry list.
     * @see #getRegdDstrbtnCtry()
     * 
     */
    public SecurityIdentification36 addRegdDstrbtnCtry(String regdDstrbtnCtry) {
        getRegdDstrbtnCtry().add(regdDstrbtnCtry);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public SecurityIdentification36 addAddtlInf(AdditionalInformation15 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
