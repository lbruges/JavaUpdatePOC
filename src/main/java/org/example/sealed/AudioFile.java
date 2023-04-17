package org.example.sealed;
//Child classes must use non-sealed OR final
public sealed abstract class AudioFile permits MP3File, FlacFile {
}
