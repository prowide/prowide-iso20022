
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
 * Choice between the securities account reference data or an operational error.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesAccountAuditTrailOrOperationalError3Choice", propOrder = {
    "sctiesAcctAudtTrlRpt",
    "oprlErr"
})
public class SecuritiesAccountAuditTrailOrOperationalError3Choice {

    @XmlElement(name = "SctiesAcctAudtTrlRpt")
    protected List<SecuritiesAccountAuditTrailReport3> sctiesAcctAudtTrlRpt;
    @XmlElement(name = "OprlErr")
    protected List<ErrorHandling5> oprlErr;

    /**
     * Gets the value of the sctiesAcctAudtTrlRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctiesAcctAudtTrlRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesAcctAudtTrlRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesAccountAuditTrailReport3 }
     * 
     * 
     */
    public List<SecuritiesAccountAuditTrailReport3> getSctiesAcctAudtTrlRpt() {
        if (sctiesAcctAudtTrlRpt == null) {
            sctiesAcctAudtTrlRpt = new ArrayList<SecuritiesAccountAuditTrailReport3>();
        }
        return this.sctiesAcctAudtTrlRpt;
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
     * {@link ErrorHandling5 }
     * 
     * 
     */
    public List<ErrorHandling5> getOprlErr() {
        if (oprlErr == null) {
            oprlErr = new ArrayList<ErrorHandling5>();
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
     * Adds a new item to the sctiesAcctAudtTrlRpt list.
     * @see #getSctiesAcctAudtTrlRpt()
     * 
     */
    public SecuritiesAccountAuditTrailOrOperationalError3Choice addSctiesAcctAudtTrlRpt(SecuritiesAccountAuditTrailReport3 sctiesAcctAudtTrlRpt) {
        getSctiesAcctAudtTrlRpt().add(sctiesAcctAudtTrlRpt);
        return this;
    }

    /**
     * Adds a new item to the oprlErr list.
     * @see #getOprlErr()
     * 
     */
    public SecuritiesAccountAuditTrailOrOperationalError3Choice addOprlErr(ErrorHandling5 oprlErr) {
        getOprlErr().add(oprlErr);
        return this;
    }

}
