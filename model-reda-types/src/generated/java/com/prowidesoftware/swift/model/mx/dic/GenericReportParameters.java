
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
 * Parameters for which a user defined report is requested.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericReportParameters", propOrder = {
    "acctId",
    "finInstrmDtls",
    "rptDesc",
    "dt",
    "usrDfndParam"
})
public class GenericReportParameters {

    @XmlElement(name = "AcctId")
    protected List<AccountIdentificationFormatChoice> acctId;
    @XmlElement(name = "FinInstrmDtls")
    protected List<FinancialInstrument17> finInstrmDtls;
    @XmlElement(name = "RptDesc", required = true)
    protected String rptDesc;
    @XmlElement(name = "Dt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dt;
    @XmlElement(name = "UsrDfndParam")
    protected List<String> usrDfndParam;

    /**
     * Gets the value of the acctId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountIdentificationFormatChoice }
     * 
     * 
     * @return
     *     The value of the acctId property.
     */
    public List<AccountIdentificationFormatChoice> getAcctId() {
        if (acctId == null) {
            acctId = new ArrayList<>();
        }
        return this.acctId;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finInstrmDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrument17 }
     * 
     * 
     * @return
     *     The value of the finInstrmDtls property.
     */
    public List<FinancialInstrument17> getFinInstrmDtls() {
        if (finInstrmDtls == null) {
            finInstrmDtls = new ArrayList<>();
        }
        return this.finInstrmDtls;
    }

    /**
     * Gets the value of the rptDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptDesc() {
        return rptDesc;
    }

    /**
     * Sets the value of the rptDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GenericReportParameters setRptDesc(String value) {
        this.rptDesc = value;
        return this;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GenericReportParameters setDt(LocalDate value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the usrDfndParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the usrDfndParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsrDfndParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the usrDfndParam property.
     */
    public List<String> getUsrDfndParam() {
        if (usrDfndParam == null) {
            usrDfndParam = new ArrayList<>();
        }
        return this.usrDfndParam;
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
     * Adds a new item to the acctId list.
     * @see #getAcctId()
     * 
     */
    public GenericReportParameters addAcctId(AccountIdentificationFormatChoice acctId) {
        getAcctId().add(acctId);
        return this;
    }

    /**
     * Adds a new item to the finInstrmDtls list.
     * @see #getFinInstrmDtls()
     * 
     */
    public GenericReportParameters addFinInstrmDtls(FinancialInstrument17 finInstrmDtls) {
        getFinInstrmDtls().add(finInstrmDtls);
        return this;
    }

    /**
     * Adds a new item to the usrDfndParam list.
     * @see #getUsrDfndParam()
     * 
     */
    public GenericReportParameters addUsrDfndParam(String usrDfndParam) {
        getUsrDfndParam().add(usrDfndParam);
        return this;
    }

}
