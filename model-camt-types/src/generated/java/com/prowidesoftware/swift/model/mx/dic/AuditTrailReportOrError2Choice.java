
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
 * Choice between details of the audit trail data or an operational error when the requested data cannot be retrieved.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditTrailReportOrError2Choice", propOrder = {
    "audtTrlRpt",
    "oprlErr"
})
public class AuditTrailReportOrError2Choice {

    @XmlElement(name = "AudtTrlRpt")
    protected AuditTrailReport2 audtTrlRpt;
    @XmlElement(name = "OprlErr")
    protected List<ErrorHandling4> oprlErr;

    /**
     * Gets the value of the audtTrlRpt property.
     * 
     * @return
     *     possible object is
     *     {@link AuditTrailReport2 }
     *     
     */
    public AuditTrailReport2 getAudtTrlRpt() {
        return audtTrlRpt;
    }

    /**
     * Sets the value of the audtTrlRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditTrailReport2 }
     *     
     */
    public AuditTrailReportOrError2Choice setAudtTrlRpt(AuditTrailReport2 value) {
        this.audtTrlRpt = value;
        return this;
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
     * {@link ErrorHandling4 }
     * 
     * 
     */
    public List<ErrorHandling4> getOprlErr() {
        if (oprlErr == null) {
            oprlErr = new ArrayList<ErrorHandling4>();
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
     * Adds a new item to the oprlErr list.
     * @see #getOprlErr()
     * 
     */
    public AuditTrailReportOrError2Choice addOprlErr(ErrorHandling4 oprlErr) {
        getOprlErr().add(oprlErr);
        return this;
    }

}
