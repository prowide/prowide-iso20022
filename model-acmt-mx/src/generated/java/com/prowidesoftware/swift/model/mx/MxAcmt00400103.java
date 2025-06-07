
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for acmt.004.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "getAcctDtls"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:acmt.004.001.03")
public class MxAcmt00400103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "GetAcctDtls", required = true)
    protected GetAccountDetailsV03 getAcctDtls;
    public final static transient String BUSINESS_PROCESS = "acmt";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account2 .class, AccountIdentification1 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, DistributionPolicy1Code.class, FinancialInstrument10 .class, FormOfSecurity1Code.class, GenderCode.class, GenericIdentification1 .class, GenericIdentification10 .class, GetAccountDetailsV03 .class, IndividualPerson4 .class, IndividualPersonIdentificationChoice.class, Intermediary7 .class, InvestmentAccount44 .class, InvestmentAccountInformationType1 .class, InvestmentAccountSelection1Choice.class, MessageIdentification1 .class, MxAcmt00400103 .class, NameAndAddress5 .class, OwnerIdentification1Choice.class, PartyIdentification2Choice.class, PartyIdentification5Choice.class, PersonIdentificationType1Code.class, PostalAddress1 .class, SecurityIdentification3Choice.class, SimpleIdentificationInformation.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:acmt.004.001.03";

    public MxAcmt00400103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt00400103(final String xml) {
        this();
        MxAcmt00400103 tmp = parse(xml);
        getAcctDtls = tmp.getGetAcctDtls();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt00400103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the getAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link GetAccountDetailsV03 }
     *     
     */
    public GetAccountDetailsV03 getGetAcctDtls() {
        return getAcctDtls;
    }

    /**
     * Sets the value of the getAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAccountDetailsV03 }
     *     
     */
    public MxAcmt00400103 setGetAcctDtls(GetAccountDetailsV03 value) {
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
    public static MxAcmt00400103 parse(String xml) {
        return ((MxAcmt00400103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00400103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAcmt00400103 parse(String xml, MxReadConfiguration conf) {
        return ((MxAcmt00400103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00400103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt00400103 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt00400103) parserImpl.read(MxAcmt00400103 .class, xml, _classes));
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
     * Creates an MxAcmt00400103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt00400103 message
     * @return
     *     a new instance of MxAcmt00400103
     */
    public final static MxAcmt00400103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAcmt00400103 .class);
    }

}
