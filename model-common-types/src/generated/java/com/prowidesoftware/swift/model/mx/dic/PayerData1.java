
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
 * Identification of a payer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayerData1", propOrder = {
    "fi",
    "id",
    "dsgnt",
    "nttyTp",
    "acctIdrTp",
    "acctIdr",
    "crdntls",
    "nm",
    "gvnNm",
    "mddlNm",
    "lastNm",
    "adr",
    "ctct",
    "ntlty",
    "ctryOfBirth",
    "dtOfBirth",
    "aliasNm",
    "ocptn",
    "prvtData",
    "ntlData",
    "lclData"
})
public class PayerData1 {

    @XmlElement(name = "FI")
    protected FinancialInstitution10 fi;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Dsgnt")
    protected String dsgnt;
    @XmlElement(name = "NttyTp")
    protected String nttyTp;
    @XmlElement(name = "AcctIdrTp")
    protected String acctIdrTp;
    @XmlElement(name = "AcctIdr")
    protected String acctIdr;
    @XmlElement(name = "Crdntls")
    protected List<Credentials3> crdntls;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "GvnNm")
    protected String gvnNm;
    @XmlElement(name = "MddlNm")
    protected String mddlNm;
    @XmlElement(name = "LastNm")
    protected String lastNm;
    @XmlElement(name = "Adr")
    protected Address4 adr;
    @XmlElement(name = "Ctct")
    protected ContactPersonal2 ctct;
    @XmlElement(name = "Ntlty")
    protected String ntlty;
    @XmlElement(name = "CtryOfBirth")
    protected String ctryOfBirth;
    @XmlElement(name = "DtOfBirth", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dtOfBirth;
    @XmlElement(name = "AliasNm")
    protected String aliasNm;
    @XmlElement(name = "Ocptn")
    protected String ocptn;
    @XmlElement(name = "PrvtData")
    protected List<ATICALaxProcessing> prvtData;
    @XmlElement(name = "NtlData")
    protected List<ATICALaxProcessing> ntlData;
    @XmlElement(name = "LclData")
    protected LocalData21 lclData;

    /**
     * Gets the value of the fi property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitution10 }
     *     
     */
    public FinancialInstitution10 getFI() {
        return fi;
    }

    /**
     * Sets the value of the fi property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitution10 }
     *     
     */
    public PayerData1 setFI(FinancialInstitution10 value) {
        this.fi = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PayerData1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the dsgnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsgnt() {
        return dsgnt;
    }

    /**
     * Sets the value of the dsgnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PayerData1 setDsgnt(String value) {
        this.dsgnt = value;
        return this;
    }

    /**
     * Gets the value of the nttyTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNttyTp() {
        return nttyTp;
    }

    /**
     * Sets the value of the nttyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PayerData1 setNttyTp(String value) {
        this.nttyTp = value;
        return this;
    }

    /**
     * Gets the value of the acctIdrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctIdrTp() {
        return acctIdrTp;
    }

    /**
     * Sets the value of the acctIdrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PayerData1 setAcctIdrTp(String value) {
        this.acctIdrTp = value;
        return this;
    }

    /**
     * Gets the value of the acctIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctIdr() {
        return acctIdr;
    }

    /**
     * Sets the value of the acctIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PayerData1 setAcctIdr(String value) {
        this.acctIdr = value;
        return this;
    }

    /**
     * Gets the value of the crdntls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the crdntls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrdntls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Credentials3 }
     * 
     * 
     * @return
     *     The value of the crdntls property.
     */
    public List<Credentials3> getCrdntls() {
        if (crdntls == null) {
            crdntls = new ArrayList<>();
        }
        return this.crdntls;
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
    public PayerData1 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the gvnNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGvnNm() {
        return gvnNm;
    }

    /**
     * Sets the value of the gvnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PayerData1 setGvnNm(String value) {
        this.gvnNm = value;
        return this;
    }

    /**
     * Gets the value of the mddlNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMddlNm() {
        return mddlNm;
    }

    /**
     * Sets the value of the mddlNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PayerData1 setMddlNm(String value) {
        this.mddlNm = value;
        return this;
    }

    /**
     * Gets the value of the lastNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNm() {
        return lastNm;
    }

    /**
     * Sets the value of the lastNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PayerData1 setLastNm(String value) {
        this.lastNm = value;
        return this;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link Address4 }
     *     
     */
    public Address4 getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address4 }
     *     
     */
    public PayerData1 setAdr(Address4 value) {
        this.adr = value;
        return this;
    }

    /**
     * Gets the value of the ctct property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPersonal2 }
     *     
     */
    public ContactPersonal2 getCtct() {
        return ctct;
    }

    /**
     * Sets the value of the ctct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPersonal2 }
     *     
     */
    public PayerData1 setCtct(ContactPersonal2 value) {
        this.ctct = value;
        return this;
    }

    /**
     * Gets the value of the ntlty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtlty() {
        return ntlty;
    }

    /**
     * Sets the value of the ntlty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PayerData1 setNtlty(String value) {
        this.ntlty = value;
        return this;
    }

    /**
     * Gets the value of the ctryOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfBirth() {
        return ctryOfBirth;
    }

    /**
     * Sets the value of the ctryOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PayerData1 setCtryOfBirth(String value) {
        this.ctryOfBirth = value;
        return this;
    }

    /**
     * Gets the value of the dtOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDtOfBirth() {
        return dtOfBirth;
    }

    /**
     * Sets the value of the dtOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PayerData1 setDtOfBirth(LocalDate value) {
        this.dtOfBirth = value;
        return this;
    }

    /**
     * Gets the value of the aliasNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasNm() {
        return aliasNm;
    }

    /**
     * Sets the value of the aliasNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PayerData1 setAliasNm(String value) {
        this.aliasNm = value;
        return this;
    }

    /**
     * Gets the value of the ocptn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOcptn() {
        return ocptn;
    }

    /**
     * Sets the value of the ocptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PayerData1 setOcptn(String value) {
        this.ocptn = value;
        return this;
    }

    /**
     * Gets the value of the prvtData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prvtData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvtData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the prvtData property.
     */
    public List<ATICALaxProcessing> getPrvtData() {
        if (prvtData == null) {
            prvtData = new ArrayList<>();
        }
        return this.prvtData;
    }

    /**
     * Gets the value of the ntlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the ntlData property.
     */
    public List<ATICALaxProcessing> getNtlData() {
        if (ntlData == null) {
            ntlData = new ArrayList<>();
        }
        return this.ntlData;
    }

    /**
     * Gets the value of the lclData property.
     * 
     * @return
     *     possible object is
     *     {@link LocalData21 }
     *     
     */
    public LocalData21 getLclData() {
        return lclData;
    }

    /**
     * Sets the value of the lclData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalData21 }
     *     
     */
    public PayerData1 setLclData(LocalData21 value) {
        this.lclData = value;
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
     * Adds a new item to the crdntls list.
     * @see #getCrdntls()
     * 
     */
    public PayerData1 addCrdntls(Credentials3 crdntls) {
        getCrdntls().add(crdntls);
        return this;
    }

    /**
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public PayerData1 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public PayerData1 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

}
