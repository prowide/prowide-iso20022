
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for acmt.004.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "getAcctDtls"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:acmt.004.001.04")
public class MxAcmt00400104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "GetAcctDtls", required = true)
    protected GetAccountDetailsV04 getAcctDtls;
    public final static transient String BUSINESS_PROCESS = "acmt";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account20 .class, AccountOwner1Choice.class, AccountSelection1Choice.class, AddressType2Choice.class, AddressType2Code.class, AlternateSecurityIdentification7 .class, DistributionPolicy1Code.class, FinancialInstrument45 .class, FormOfSecurity1Code.class, GenderCode.class, GenericIdentification1 .class, GenericIdentification47 .class, GenericIdentification81 .class, GetAccountDetailsV04 .class, IdentificationSource1Choice.class, IndividualPerson30 .class, IndividualPersonIdentification1Choice.class, Intermediary33 .class, InvestmentAccount52 .class, InvestmentAccountInformationType1 .class, MessageIdentification1 .class, MxAcmt00400104 .class, NameAndAddress15 .class, NameAndAddress5 .class, OtherIdentification3Choice.class, PartyIdentification70Choice.class, PartyIdentification96 .class, PartyIdentification96Choice.class, PartyIdentificationType7Code.class, PostalAddress1 .class, PostalAddress21 .class, SecurityIdentification23Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:acmt.004.001.04";

    public MxAcmt00400104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt00400104(final String xml) {
        this();
        MxAcmt00400104 tmp = parse(xml);
        getAcctDtls = tmp.getGetAcctDtls();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt00400104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the getAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link GetAccountDetailsV04 }
     *     
     */
    public GetAccountDetailsV04 getGetAcctDtls() {
        return getAcctDtls;
    }

    /**
     * Sets the value of the getAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAccountDetailsV04 }
     *     
     */
    public MxAcmt00400104 setGetAcctDtls(GetAccountDetailsV04 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxAcmt00400104 parse(String xml) {
        return ((MxAcmt00400104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00400104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAcmt00400104 parse(String xml, MxReadConfiguration conf) {
        return ((MxAcmt00400104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00400104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt00400104 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt00400104) parserImpl.read(MxAcmt00400104 .class, xml, _classes));
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
     * Creates an MxAcmt00400104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt00400104 message
     * @return
     *     a new instance of MxAcmt00400104
     */
    public final static MxAcmt00400104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAcmt00400104 .class);
    }

}
