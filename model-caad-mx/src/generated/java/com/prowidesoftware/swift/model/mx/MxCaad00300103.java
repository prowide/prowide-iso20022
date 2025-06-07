
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
 * Class for caad.003.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "btchTrfInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caad.003.001.03")
public class MxCaad00300103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "BtchTrfInitn", required = true)
    protected BatchTransferInitiationV03 btchTrfInitn;
    public final static transient String BUSINESS_PROCESS = "caad";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalData1 .class, AdditionalData2 .class, AdditionalInformation21 .class, Algorithm13Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, AttributeType1Code.class, BatchManagementInformation1 .class, BatchTransferInitiationV03 .class, BytePadding1Code.class, CertificateIssuer1 .class, ClearingBatchData3 .class, ClearingControlTotals3 .class, ClearingMethod2Code.class, ContentInformationType41 .class, ContentType2Code.class, ContentType3Code.class, CreditDebit3Code.class, EncryptedContent8 .class, EncryptedData2 .class, EncryptedData2Choice.class, EncryptedDataElement2 .class, EncryptedDataFormat1Code.class, EncryptionFormat3Code.class, EnvelopedData12 .class, GenericIdentification183 .class, Header71 .class, IssuerAndSerialNumber1 .class, Jurisdiction2 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport6 .class, LocalData14 .class, MACData1 .class, MxCaad00300103 .class, OtherAmount5 .class, OutputFormat4Code.class, Parameter13 .class, Parameter14 .class, Parameter7 .class, PartyIdentification286 .class, PartyType17Code.class, PartyType18Code.class, PartyType23Code.class, PartyType26Code.class, PartyType9Code.class, ProcessingResult26 .class, ProgrammeMode5 .class, ProtectedData2 .class, Recipient5Choice.class, Recipient7Choice.class, Reconciliation4 .class, Record3 .class, RecordMessage1Choice.class, RelativeDistinguishedName1 .class, SettlementService6 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Traceability10 .class, UserInterface7Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caad.003.001.03";

    public MxCaad00300103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaad00300103(final String xml) {
        this();
        MxCaad00300103 tmp = parse(xml);
        btchTrfInitn = tmp.getBtchTrfInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaad00300103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the btchTrfInitn property.
     * 
     * @return
     *     possible object is
     *     {@link BatchTransferInitiationV03 }
     *     
     */
    public BatchTransferInitiationV03 getBtchTrfInitn() {
        return btchTrfInitn;
    }

    /**
     * Sets the value of the btchTrfInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchTransferInitiationV03 }
     *     
     */
    public MxCaad00300103 setBtchTrfInitn(BatchTransferInitiationV03 value) {
        this.btchTrfInitn = value;
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
    public static MxCaad00300103 parse(String xml) {
        return ((MxCaad00300103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaad00300103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaad00300103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaad00300103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaad00300103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaad00300103 parse(String xml, MxRead parserImpl) {
        return ((MxCaad00300103) parserImpl.read(MxCaad00300103 .class, xml, _classes));
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
     * Creates an MxCaad00300103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaad00300103 message
     * @return
     *     a new instance of MxCaad00300103
     */
    public final static MxCaad00300103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaad00300103 .class);
    }

}
