
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Defines the criteria used to search for a member.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberSearchCriteria2", propOrder = {
    "id",
    "tp",
    "sts"
})
public class MemberSearchCriteria2 {

    @XmlElement(name = "Id")
    protected List<MemberIdentification2Choice> id;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected List<MemberType1Code> tp;
    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected List<MemberStatus1Code> sts;

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberIdentification2Choice }
     * 
     * 
     */
    public List<MemberIdentification2Choice> getId() {
        if (id == null) {
            id = new ArrayList<MemberIdentification2Choice>();
        }
        return this.id;
    }

    /**
     * Gets the value of the tp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberType1Code }
     * 
     * 
     */
    public List<MemberType1Code> getTp() {
        if (tp == null) {
            tp = new ArrayList<MemberType1Code>();
        }
        return this.tp;
    }

    /**
     * Gets the value of the sts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberStatus1Code }
     * 
     * 
     */
    public List<MemberStatus1Code> getSts() {
        if (sts == null) {
            sts = new ArrayList<MemberStatus1Code>();
        }
        return this.sts;
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
     * Adds a new item to the id list.
     * @see #getId()
     * 
     */
    public MemberSearchCriteria2 addId(MemberIdentification2Choice id) {
        getId().add(id);
        return this;
    }

    /**
     * Adds a new item to the tp list.
     * @see #getTp()
     * 
     */
    public MemberSearchCriteria2 addTp(MemberType1Code tp) {
        getTp().add(tp);
        return this;
    }

    /**
     * Adds a new item to the sts list.
     * @see #getSts()
     * 
     */
    public MemberSearchCriteria2 addSts(MemberStatus1Code sts) {
        getSts().add(sts);
        return this;
    }

}
