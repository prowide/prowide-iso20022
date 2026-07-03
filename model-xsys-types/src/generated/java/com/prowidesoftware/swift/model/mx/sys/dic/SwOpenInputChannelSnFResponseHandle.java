
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for OpenInputChannelSnFResponseHandle complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenInputChannelSnFResponseHandle", propOrder = {
    "windowSize",
    "nextSnFInputSeq",
    "token",
    "memberList"
})
public class SwOpenInputChannelSnFResponseHandle {

    @XmlElement(name = "WindowSize", required = true)
    protected String windowSize;
    @XmlElement(name = "NextSnFInputSeq", required = true)
    protected String nextSnFInputSeq;
    @XmlElement(name = "Token", required = true)
    protected String token;
    @XmlElement(name = "MemberList")
    protected SwMemberList memberList;

    /**
     * Gets the value of the windowSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindowSize() {
        return windowSize;
    }

    /**
     * Sets the value of the windowSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwOpenInputChannelSnFResponseHandle setWindowSize(String value) {
        this.windowSize = value;
        return this;
    }

    /**
     * Gets the value of the nextSnFInputSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextSnFInputSeq() {
        return nextSnFInputSeq;
    }

    /**
     * Sets the value of the nextSnFInputSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwOpenInputChannelSnFResponseHandle setNextSnFInputSeq(String value) {
        this.nextSnFInputSeq = value;
        return this;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwOpenInputChannelSnFResponseHandle setToken(String value) {
        this.token = value;
        return this;
    }

    /**
     * Gets the value of the memberList property.
     * 
     * @return
     *     possible object is
     *     {@link SwMemberList }
     *     
     */
    public SwMemberList getMemberList() {
        return memberList;
    }

    /**
     * Sets the value of the memberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwMemberList }
     *     
     */
    public SwOpenInputChannelSnFResponseHandle setMemberList(SwMemberList value) {
        this.memberList = value;
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

}
