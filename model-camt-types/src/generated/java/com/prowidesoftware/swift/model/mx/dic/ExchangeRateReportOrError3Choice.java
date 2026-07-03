
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
 * It is used to provide information on static data maintained by the transaction administrator and related to currency exchange details as maintained for system operations by the transaction administrator.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeRateReportOrError3Choice", propOrder = {
    "ccyXchgRpt",
    "oprlErr"
})
public class ExchangeRateReportOrError3Choice {

    @XmlElement(name = "CcyXchgRpt")
    protected List<CurrencyExchangeReport4> ccyXchgRpt;
    @XmlElement(name = "OprlErr")
    protected List<ErrorHandling3> oprlErr;

    /**
     * Gets the value of the ccyXchgRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccyXchgRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcyXchgRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyExchangeReport4 }
     * 
     * 
     */
    public List<CurrencyExchangeReport4> getCcyXchgRpt() {
        if (ccyXchgRpt == null) {
            ccyXchgRpt = new ArrayList<CurrencyExchangeReport4>();
        }
        return this.ccyXchgRpt;
    }

    /**
     * Gets the value of the oprlErr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oprlErr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOprlErr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorHandling3 }
     * 
     * 
     */
    public List<ErrorHandling3> getOprlErr() {
        if (oprlErr == null) {
            oprlErr = new ArrayList<ErrorHandling3>();
        }
        return this.oprlErr;
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
     * Adds a new item to the ccyXchgRpt list.
     * @see #getCcyXchgRpt()
     * 
     */
    public ExchangeRateReportOrError3Choice addCcyXchgRpt(CurrencyExchangeReport4 ccyXchgRpt) {
        getCcyXchgRpt().add(ccyXchgRpt);
        return this;
    }

    /**
     * Adds a new item to the oprlErr list.
     * @see #getOprlErr()
     * 
     */
    public ExchangeRateReportOrError3Choice addOprlErr(ErrorHandling3 oprlErr) {
        getOprlErr().add(oprlErr);
        return this;
    }

}
