
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
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for catp.011.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "atmpinMgmtRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catp.011.001.02")
public class MxCatp01100102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ATMPINMgmtRspn", required = true)
    protected ATMPINManagementResponseV02 atmpinMgmtRspn;
    public final static transient String BUSINESS_PROCESS = "catp";
    public final static transient int FUNCTIONALITY = 11;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ATMCommand4Code.class, ATMCommand7 .class, ATMCommandIdentification1 .class, ATMCommandParameters1Choice.class, ATMConfigurationParameter1 .class, ATMContext17 .class, ATMCustomer5 .class, ATMCustomerProfile2 .class, ATMDevice1Code.class, ATMEnvironment12 .class, ATMMessageFunction2 .class, ATMPINManagementResponse2 .class, ATMPINManagementResponseV02 .class, ATMService21 .class, ATMServiceType5Code.class, ATMStatus1Code.class, ATMTransaction22 .class, Acquirer7 .class, Acquirer8 .class, Action7 .class, ActionMessage4 .class, ActionType6Code.class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AttributeType1Code.class, AuthenticatedData4 .class, AuthenticationEntity2Code.class, AuthenticationMethod7Code.class, AutomatedTellerMachine2 .class, BytePadding1Code.class, CertificateIssuer1 .class, ContentInformationType10 .class, ContentInformationType15 .class, ContentType2Code.class, DataSetCategory7Code.class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, GenericIdentification77 .class, GeographicCoordinates1 .class, GeographicLocation1Choice.class, Header31 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, MessageFunction11Code.class, MessageFunction8Code.class, MxCatp01100102 .class, OutputFormat2Code.class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, PartyType12Code.class, PlainCardData19 .class, PostalAddress17 .class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, Response4Code.class, ResponseType7 .class, ResultDetail4Code.class, TMSContactLevel2Code.class, TerminalHosting1 .class, Traceability4 .class, TransactionEnvironment3Code.class, TransactionIdentifier1 .class, TransactionVerificationResult5 .class, UTMCoordinates1 .class, Verification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catp.011.001.02";

    public MxCatp01100102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatp01100102(final String xml) {
        this();
        MxCatp01100102 tmp = parse(xml);
        atmpinMgmtRspn = tmp.getATMPINMgmtRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatp01100102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the atmpinMgmtRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ATMPINManagementResponseV02 }
     *     
     */
    public ATMPINManagementResponseV02 getATMPINMgmtRspn() {
        return atmpinMgmtRspn;
    }

    /**
     * Sets the value of the atmpinMgmtRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMPINManagementResponseV02 }
     *     
     */
    public MxCatp01100102 setATMPINMgmtRspn(ATMPINManagementResponseV02 value) {
        this.atmpinMgmtRspn = value;
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
    public static MxCatp01100102 parse(String xml) {
        return ((MxCatp01100102) MxReadImpl.parse(MxCatp01100102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatp01100102 parse(String xml, MxRead parserImpl) {
        return ((MxCatp01100102) parserImpl.read(MxCatp01100102 .class, xml, _classes));
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
     * Creates an MxCatp01100102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatp01100102 message
     * @return
     *     a new instance of MxCatp01100102
     */
    public final static MxCatp01100102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatp01100102 .class);
    }

}
