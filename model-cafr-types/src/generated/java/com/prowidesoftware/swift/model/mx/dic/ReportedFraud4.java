
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
 * Fraud reporting type information
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportedFraud4", propOrder = {
    "tp",
    "othrTp",
    "actn",
    "othrActn",
    "rptgNtty",
    "othrRptgNtty",
    "cmprmsdCrdntl",
    "crdhldrRptgDt",
    "confRptgDt",
    "submitrCaseRef",
    "mktSgmt",
    "caseLctrNb",
    "caseRef",
    "arrst",
    "invstgtnSts"
})
public class ReportedFraud4 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected FraudType1Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "Actn", required = true)
    @XmlSchemaType(name = "string")
    protected FraudReportingAction1Code actn;
    @XmlElement(name = "OthrActn")
    protected String othrActn;
    @XmlElement(name = "RptgNtty", required = true)
    @XmlSchemaType(name = "string")
    protected PartyType26Code rptgNtty;
    @XmlElement(name = "OthrRptgNtty")
    protected String othrRptgNtty;
    @XmlElement(name = "CmprmsdCrdntl")
    @XmlSchemaType(name = "string")
    protected List<AuthenticationMethod12Code> cmprmsdCrdntl;
    @XmlElement(name = "CrdhldrRptgDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate crdhldrRptgDt;
    @XmlElement(name = "ConfRptgDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate confRptgDt;
    @XmlElement(name = "SubmitrCaseRef")
    protected String submitrCaseRef;
    @XmlElement(name = "MktSgmt")
    protected String mktSgmt;
    @XmlElement(name = "CaseLctrNb")
    protected String caseLctrNb;
    @XmlElement(name = "CaseRef")
    protected String caseRef;
    @XmlElement(name = "Arrst")
    protected Boolean arrst;
    @XmlElement(name = "InvstgtnSts")
    protected String invstgtnSts;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link FraudType1Code }
     *     
     */
    public FraudType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudType1Code }
     *     
     */
    public ReportedFraud4 setTp(FraudType1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the othrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Sets the value of the othrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportedFraud4 setOthrTp(String value) {
        this.othrTp = value;
        return this;
    }

    /**
     * Gets the value of the actn property.
     * 
     * @return
     *     possible object is
     *     {@link FraudReportingAction1Code }
     *     
     */
    public FraudReportingAction1Code getActn() {
        return actn;
    }

    /**
     * Sets the value of the actn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudReportingAction1Code }
     *     
     */
    public ReportedFraud4 setActn(FraudReportingAction1Code value) {
        this.actn = value;
        return this;
    }

    /**
     * Gets the value of the othrActn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrActn() {
        return othrActn;
    }

    /**
     * Sets the value of the othrActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportedFraud4 setOthrActn(String value) {
        this.othrActn = value;
        return this;
    }

    /**
     * Gets the value of the rptgNtty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType26Code }
     *     
     */
    public PartyType26Code getRptgNtty() {
        return rptgNtty;
    }

    /**
     * Sets the value of the rptgNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType26Code }
     *     
     */
    public ReportedFraud4 setRptgNtty(PartyType26Code value) {
        this.rptgNtty = value;
        return this;
    }

    /**
     * Gets the value of the othrRptgNtty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrRptgNtty() {
        return othrRptgNtty;
    }

    /**
     * Sets the value of the othrRptgNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportedFraud4 setOthrRptgNtty(String value) {
        this.othrRptgNtty = value;
        return this;
    }

    /**
     * Gets the value of the cmprmsdCrdntl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cmprmsdCrdntl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmprmsdCrdntl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthenticationMethod12Code }
     * 
     * 
     * @return
     *     The value of the cmprmsdCrdntl property.
     */
    public List<AuthenticationMethod12Code> getCmprmsdCrdntl() {
        if (cmprmsdCrdntl == null) {
            cmprmsdCrdntl = new ArrayList<>();
        }
        return this.cmprmsdCrdntl;
    }

    /**
     * Gets the value of the crdhldrRptgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getCrdhldrRptgDt() {
        return crdhldrRptgDt;
    }

    /**
     * Sets the value of the crdhldrRptgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportedFraud4 setCrdhldrRptgDt(LocalDate value) {
        this.crdhldrRptgDt = value;
        return this;
    }

    /**
     * Gets the value of the confRptgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getConfRptgDt() {
        return confRptgDt;
    }

    /**
     * Sets the value of the confRptgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportedFraud4 setConfRptgDt(LocalDate value) {
        this.confRptgDt = value;
        return this;
    }

    /**
     * Gets the value of the submitrCaseRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitrCaseRef() {
        return submitrCaseRef;
    }

    /**
     * Sets the value of the submitrCaseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportedFraud4 setSubmitrCaseRef(String value) {
        this.submitrCaseRef = value;
        return this;
    }

    /**
     * Gets the value of the mktSgmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktSgmt() {
        return mktSgmt;
    }

    /**
     * Sets the value of the mktSgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportedFraud4 setMktSgmt(String value) {
        this.mktSgmt = value;
        return this;
    }

    /**
     * Gets the value of the caseLctrNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseLctrNb() {
        return caseLctrNb;
    }

    /**
     * Sets the value of the caseLctrNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportedFraud4 setCaseLctrNb(String value) {
        this.caseLctrNb = value;
        return this;
    }

    /**
     * Gets the value of the caseRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseRef() {
        return caseRef;
    }

    /**
     * Sets the value of the caseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportedFraud4 setCaseRef(String value) {
        this.caseRef = value;
        return this;
    }

    /**
     * Gets the value of the arrst property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArrst() {
        return arrst;
    }

    /**
     * Sets the value of the arrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ReportedFraud4 setArrst(Boolean value) {
        this.arrst = value;
        return this;
    }

    /**
     * Gets the value of the invstgtnSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvstgtnSts() {
        return invstgtnSts;
    }

    /**
     * Sets the value of the invstgtnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportedFraud4 setInvstgtnSts(String value) {
        this.invstgtnSts = value;
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
     * Adds a new item to the cmprmsdCrdntl list.
     * @see #getCmprmsdCrdntl()
     * 
     */
    public ReportedFraud4 addCmprmsdCrdntl(AuthenticationMethod12Code cmprmsdCrdntl) {
        getCmprmsdCrdntl().add(cmprmsdCrdntl);
        return this;
    }

}
