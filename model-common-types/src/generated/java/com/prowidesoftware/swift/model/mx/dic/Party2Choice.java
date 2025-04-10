
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
 * Choice between the identification of a person and the identification of a non-financial institution.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party2Choice", propOrder = {
    "orgId",
    "prvtId"
})
public class Party2Choice {

    @XmlElement(name = "OrgId")
    protected OrganisationIdentification2 orgId;
    @XmlElement(name = "PrvtId")
    protected List<PersonIdentification3> prvtId;

    /**
     * Gets the value of the orgId property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification2 }
     *     
     */
    public OrganisationIdentification2 getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification2 }
     *     
     */
    public Party2Choice setOrgId(OrganisationIdentification2 value) {
        this.orgId = value;
        return this;
    }

    /**
     * Gets the value of the prvtId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prvtId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvtId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonIdentification3 }
     * 
     * 
     */
    public List<PersonIdentification3> getPrvtId() {
        if (prvtId == null) {
            prvtId = new ArrayList<PersonIdentification3>();
        }
        return this.prvtId;
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
     * Adds a new item to the prvtId list.
     * @see #getPrvtId()
     * 
     */
    public Party2Choice addPrvtId(PersonIdentification3 prvtId) {
        getPrvtId().add(prvtId);
        return this;
    }

}
