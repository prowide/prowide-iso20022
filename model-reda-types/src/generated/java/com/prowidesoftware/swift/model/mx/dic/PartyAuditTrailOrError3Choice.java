
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
 * Used to report between the party reference data or an operational error.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyAuditTrailOrError3Choice", propOrder = {
    "ptyAudtTrlRpt",
    "oprlErr"
})
public class PartyAuditTrailOrError3Choice {

    @XmlElement(name = "PtyAudtTrlRpt")
    protected List<PartyAuditTrailReport4> ptyAudtTrlRpt;
    @XmlElement(name = "OprlErr")
    protected List<ErrorHandling5> oprlErr;

    /**
     * Gets the value of the ptyAudtTrlRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptyAudtTrlRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPtyAudtTrlRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyAuditTrailReport4 }
     * 
     * 
     */
    public List<PartyAuditTrailReport4> getPtyAudtTrlRpt() {
        if (ptyAudtTrlRpt == null) {
            ptyAudtTrlRpt = new ArrayList<PartyAuditTrailReport4>();
        }
        return this.ptyAudtTrlRpt;
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
     * Adds a new item to the ptyAudtTrlRpt list.
     * @see #getPtyAudtTrlRpt()
     * 
     */
    public PartyAuditTrailOrError3Choice addPtyAudtTrlRpt(PartyAuditTrailReport4 ptyAudtTrlRpt) {
        getPtyAudtTrlRpt().add(ptyAudtTrlRpt);
        return this;
    }

    /**
     * Adds a new item to the oprlErr list.
     * @see #getOprlErr()
     * 
     */
    public PartyAuditTrailOrError3Choice addOprlErr(ErrorHandling5 oprlErr) {
        getOprlErr().add(oprlErr);
        return this;
    }

}
