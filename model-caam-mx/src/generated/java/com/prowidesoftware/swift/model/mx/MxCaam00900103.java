
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for caam.009.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "atmRcncltnAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caam.009.001.03")
public class MxCaam00900103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ATMRcncltnAdvc", required = true)
    protected ATMReconciliationAdviceV03 atmRcncltnAdvc;
    public static final transient String BUSINESS_PROCESS = "caam";
    public static final transient int FUNCTIONALITY = 9;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ATMCassette3 .class, ATMCassetteCounters5 .class, ATMCassetteCounters6 .class, ATMCassetteStatus1Code.class, ATMCassetteType1Code.class, ATMCommand5Code.class, ATMCommand8 .class, ATMCommand9 .class, ATMCommandIdentification1 .class, ATMConfigurationParameter1 .class, ATMCounterType2Code.class, ATMCounterType3Code.class, ATMEnvironment22 .class, ATMEquipment1 .class, ATMMediaType3Code.class, ATMMediaType4Code.class, ATMMessageFunction2 .class, ATMNoteType1Code.class, ATMOperation2Code.class, ATMReconciliationAdvice3 .class, ATMReconciliationAdviceV03 .class, ATMReconciliationOperation1 .class, ATMTotals3 .class, ATMTotals4 .class, ATMTransaction36 .class, Acquirer7 .class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AttributeType1Code.class, AuthenticatedData4 .class, AutomatedTellerMachine8 .class, BytePadding1Code.class, CardDataReading1Code.class, CertificateIssuer1 .class, ContentInformationType10 .class, ContentInformationType15 .class, ContentType2Code.class, CurrencyAndAmount.class, DataSetCategory7Code.class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, FailureReason9Code.class, GenericIdentification77 .class, GeographicCoordinates1 .class, GeographicLocation1Choice.class, Header32 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, MessageFunction11Code.class, MxCaam00900103 .class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, PartyType12Code.class, PaymentCard37 .class, PlainCardData24 .class, PostalAddress17 .class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, TerminalHosting1 .class, TerminalManagementActionResult2Code.class, Traceability4 .class, TransactionEnvironment2Code.class, TransactionEnvironment3Code.class, TransactionIdentifier3 .class, UTMCoordinates1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caam.009.001.03";

    public MxCaam00900103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaam00900103(final String xml) {
        this();
        MxCaam00900103 tmp = parse(xml);
        atmRcncltnAdvc = tmp.getATMRcncltnAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaam00900103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the atmRcncltnAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link ATMReconciliationAdviceV03 }
     *     
     */
    public ATMReconciliationAdviceV03 getATMRcncltnAdvc() {
        return atmRcncltnAdvc;
    }

    /**
     * Sets the value of the atmRcncltnAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMReconciliationAdviceV03 }
     *     
     */
    public MxCaam00900103 setATMRcncltnAdvc(ATMReconciliationAdviceV03 value) {
        this.atmRcncltnAdvc = value;
        return this;
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
    public static MxCaam00900103 parse(String xml) {
        return ((MxCaam00900103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaam00900103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaam00900103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaam00900103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaam00900103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaam00900103 parse(String xml, MxRead parserImpl) {
        return ((MxCaam00900103) parserImpl.read(MxCaam00900103 .class, xml, _classes));
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
     * Creates an MxCaam00900103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaam00900103 message
     * @return
     *     a new instance of MxCaam00900103
     */
    public static final MxCaam00900103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaam00900103 .class);
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
