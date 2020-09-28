
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for acmt.004.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "getAcctDtls"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:acmt.004.001.06")
public class MxAcmt00400106
    extends AbstractMX
{

    @XmlElement(name = "GetAcctDtls", required = true)
    protected GetAccountDetailsV06 getAcctDtls;
    public final static transient String BUSINESS_PROCESS = "acmt";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account32 .class, AccountOwner3Choice.class, AccountSelection3Choice.class, AddressType2Choice.class, AddressType2Code.class, AlternateSecurityIdentification7 .class, DistributionPolicy1Code.class, FinancialInstrument55 .class, FormOfSecurity1Code.class, Gender1Code.class, GenericIdentification1 .class, GenericIdentification47 .class, GenericIdentification81 .class, GetAccountDetailsV06 .class, IdentificationSource1Choice.class, IndividualPerson35 .class, IndividualPersonIdentification3Choice.class, Intermediary47 .class, InvestmentAccount76 .class, InvestmentAccountInformationType1 .class, MessageIdentification1 .class, MxAcmt00400106 .class, NameAndAddress15 .class, NameAndAddress5 .class, OtherIdentification3Choice.class, PartyIdentification125Choice.class, PartyIdentification182Choice.class, PartyIdentification220 .class, PartyIdentificationType7Code.class, PostalAddress1 .class, PostalAddress21 .class, SecurityIdentification25Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:acmt.004.001.06";

    public MxAcmt00400106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt00400106(final String xml) {
        this();
        MxAcmt00400106 tmp = parse(xml);
        getAcctDtls = tmp.getGetAcctDtls();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt00400106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the getAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link GetAccountDetailsV06 }
     *     
     */
    public GetAccountDetailsV06 getGetAcctDtls() {
        return getAcctDtls;
    }

    /**
     * Sets the value of the getAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAccountDetailsV06 }
     *     
     */
    public MxAcmt00400106 setGetAcctDtls(GetAccountDetailsV06 value) {
        this.getAcctDtls = value;
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

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxAcmt00400106 parse(String xml) {
        return ((MxAcmt00400106) MxReadImpl.parse(MxAcmt00400106 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt00400106 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt00400106) parserImpl.read(MxAcmt00400106 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxAcmt00400106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt00400106 message
     * @return
     *     a new instance of MxAcmt00400106
     */
    public final static MxAcmt00400106 fromJson(String json) {
        return AbstractMX.fromJson(json, MxAcmt00400106 .class);
    }

}
