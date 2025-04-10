
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
@XmlType(name = "ReportedFraud1", propOrder = {
    "frdTp",
    "othrFrdTp",
    "frdRptgActn",
    "othrFrdRptgActn",
    "rptgNtty",
    "othrRptgNtty",
    "cmprmsdCrdntl",
    "crdhldrRptgDt",
    "confRptgDt",
    "submitrCaseRef",
    "frdCaseDtls",
    "frdInvstgtnSts"
})
public class ReportedFraud1 {

    @XmlElement(name = "FrdTp", required = true)
    @XmlSchemaType(name = "string")
    protected FraudType1Code frdTp;
    @XmlElement(name = "OthrFrdTp")
    protected String othrFrdTp;
    @XmlElement(name = "FrdRptgActn", required = true)
    @XmlSchemaType(name = "string")
    protected FraudReportingAction1Code frdRptgActn;
    @XmlElement(name = "OthrFrdRptgActn")
    protected String othrFrdRptgActn;
    @XmlElement(name = "RptgNtty", required = true)
    @XmlSchemaType(name = "string")
    protected PartyType26Code rptgNtty;
    @XmlElement(name = "OthrRptgNtty")
    protected String othrRptgNtty;
    @XmlElement(name = "CmprmsdCrdntl")
    @XmlSchemaType(name = "string")
    protected List<AuthenticationMethod11Code> cmprmsdCrdntl;
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
    @XmlElement(name = "FrdCaseDtls")
    protected FraudCaseDetails1 frdCaseDtls;
    @XmlElement(name = "FrdInvstgtnSts")
    protected String frdInvstgtnSts;

    /**
     * Gets the value of the frdTp property.
     * 
     * @return
     *     possible object is
     *     {@link FraudType1Code }
     *     
     */
    public FraudType1Code getFrdTp() {
        return frdTp;
    }

    /**
     * Sets the value of the frdTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudType1Code }
     *     
     */
    public ReportedFraud1 setFrdTp(FraudType1Code value) {
        this.frdTp = value;
        return this;
    }

    /**
     * Gets the value of the othrFrdTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrFrdTp() {
        return othrFrdTp;
    }

    /**
     * Sets the value of the othrFrdTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportedFraud1 setOthrFrdTp(String value) {
        this.othrFrdTp = value;
        return this;
    }

    /**
     * Gets the value of the frdRptgActn property.
     * 
     * @return
     *     possible object is
     *     {@link FraudReportingAction1Code }
     *     
     */
    public FraudReportingAction1Code getFrdRptgActn() {
        return frdRptgActn;
    }

    /**
     * Sets the value of the frdRptgActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudReportingAction1Code }
     *     
     */
    public ReportedFraud1 setFrdRptgActn(FraudReportingAction1Code value) {
        this.frdRptgActn = value;
        return this;
    }

    /**
     * Gets the value of the othrFrdRptgActn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrFrdRptgActn() {
        return othrFrdRptgActn;
    }

    /**
     * Sets the value of the othrFrdRptgActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportedFraud1 setOthrFrdRptgActn(String value) {
        this.othrFrdRptgActn = value;
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
    public ReportedFraud1 setRptgNtty(PartyType26Code value) {
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
    public ReportedFraud1 setOthrRptgNtty(String value) {
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
     * {@link AuthenticationMethod11Code }
     * 
     * 
     * @return
     *     The value of the cmprmsdCrdntl property.
     */
    public List<AuthenticationMethod11Code> getCmprmsdCrdntl() {
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
    public ReportedFraud1 setCrdhldrRptgDt(LocalDate value) {
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
    public ReportedFraud1 setConfRptgDt(LocalDate value) {
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
    public ReportedFraud1 setSubmitrCaseRef(String value) {
        this.submitrCaseRef = value;
        return this;
    }

    /**
     * Gets the value of the frdCaseDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FraudCaseDetails1 }
     *     
     */
    public FraudCaseDetails1 getFrdCaseDtls() {
        return frdCaseDtls;
    }

    /**
     * Sets the value of the frdCaseDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudCaseDetails1 }
     *     
     */
    public ReportedFraud1 setFrdCaseDtls(FraudCaseDetails1 value) {
        this.frdCaseDtls = value;
        return this;
    }

    /**
     * Gets the value of the frdInvstgtnSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrdInvstgtnSts() {
        return frdInvstgtnSts;
    }

    /**
     * Sets the value of the frdInvstgtnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportedFraud1 setFrdInvstgtnSts(String value) {
        this.frdInvstgtnSts = value;
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
    public ReportedFraud1 addCmprmsdCrdntl(AuthenticationMethod11Code cmprmsdCrdntl) {
        getCmprmsdCrdntl().add(cmprmsdCrdntl);
        return this;
    }

}
